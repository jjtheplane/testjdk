package karate;

import com.intuit.karate.Logger;
import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;
import org.springframework.http.*;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertTrue;


public class KarateRunner {

    private static final int MAX_TRY = 30;
    private static final int TIMEOUT_IN_MILLIS = 35 * 1000;
    private static final String KARATE_ENV = System.getProperty("karate.env");
    Logger logger = new Logger();
    private String path = "/actuator/health";

    @Test
    public void testSelected() {

        awaitForService();

        List<String> tags = Arrays.asList("~@ignore");
        List<String> features = Arrays.asList("classpath:karate/");
        String karateOutputPath = "target/surefire-reports";
        Results results = Runner.parallel(tags, features, 1, karateOutputPath);
        this.generateReport(karateOutputPath);
        assertTrue(results.getErrorMessages(), results.getFailCount() == 0);

    }

    public static void generateReport(String karateOutputPath) {
        Collection<File> jsonFiles = FileUtils.listFiles(new File(karateOutputPath), new String[]{"json"}, true);
        List<String> jsonPaths = new ArrayList(jsonFiles.size());
        jsonFiles.forEach(file -> jsonPaths.add(file.getAbsolutePath()));
        Configuration config = new Configuration(new File("target"), "demo");
        ReportBuilder reportBuilder = new ReportBuilder(jsonPaths, config);
        reportBuilder.generateReports();
    }

    private String getKarateEnv() {
        if (KARATE_ENV != null && !KARATE_ENV.equals("")) {
            return KARATE_ENV;
        } else {
            return "dev";
        }
    }

    private String readEnvData() {
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("karate/env_data.json");
        String result = null;
        try {
            result = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
        } catch (IOException ioException) {
            ioException.printStackTrace();
            throw new RuntimeException("Error on read  env_data.json", ioException);
        }
        return result;
    }

    private String obtainUrl() throws JSONException {
        String envDataRaw = readEnvData();
        JSONObject envDataContainer = new JSONObject(envDataRaw);
        JSONObject envData = envDataContainer.getJSONObject(getKarateEnv());
        JSONObject envUrls = envData.getJSONObject("urls");
        String functionalitiesUrl = envUrls.getString("client_information");
        logger.info(functionalitiesUrl);
        return functionalitiesUrl;
    }

    private void timeWait() {
        try {
            logger.info("await for service, sleeping " + TIMEOUT_IN_MILLIS + " milliseconds");
            Thread.sleep(TIMEOUT_IN_MILLIS);
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
            throw new RuntimeException("Error on sleep ", interruptedException);
        }
    }

    private void awaitForService() {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("id_channel", "onlinebanking");
        HttpEntity entity = new HttpEntity(headers);

        logger.info("karate.env: " + getKarateEnv());
        for (int i = 0; i < MAX_TRY; i++) {
            timeWait();
            logger.info("trying health proof on service: " + i);
            ResponseEntity<String> response = null;
            try {
                response = restTemplate.exchange(obtainUrl() + path, HttpMethod.GET, entity, String.class);
            } catch (RestClientResponseException | JSONException restClientResponseException) {
                logger.info("service not responding, error received: " + restClientResponseException.getClass().getName());
                continue;
            }
            HttpStatus statusCode = response.getStatusCode();
            if (statusCode != null && statusCode.is2xxSuccessful()) {
                logger.info("service is running, continue with test phase");
                return;
            }
        }
        logger.info("service not responding, aborting test");
        throw new RuntimeException("service not responding");
    }
}
