package ar.com.bancogalicia;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.request.RequestContextListener;

@SpringBootApplication
public class Application {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder) {
		return restTemplateBuilder.build();
	}

	/**
	 * Main method to start the application.
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		LOGGER.info("Microservice - pom-people-customer-information-receiver-v2 application is now running.....");
	}

	@Bean
	public RequestContextListener requestContextListener() {
		return new RequestContextListener();
	}

}