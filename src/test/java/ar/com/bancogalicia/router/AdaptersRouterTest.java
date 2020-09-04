package ar.com.bancogalicia.router;

import ar.com.bancogalicia.route.AdaptersRouter;
import org.apache.camel.builder.AdviceWithRouteBuilder;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.RouteDefinition;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.annotation.DirtiesContext;
import java.io.InputStream;
import java.util.Properties;

@RunWith(MockitoJUnitRunner.class)
public class AdaptersRouterTest extends CamelTestSupport {

    @InjectMocks
    private AdaptersRouter mainRouter;

    @Override
    public boolean isUseRouteBuilder() {
        return true;
    }

    @Override
    public boolean isUseAdviceWith() {
        return true;
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return mainRouter;
    }
    @Before
    public void init() throws Exception {
        RouteDefinition mainRoute = context.getRouteDefinitions().get(0);

        AdviceWithRouteBuilder mock = new AdviceWithRouteBuilder() {
            @Override
            public void configure() throws Exception {
            }
        };

        mainRoute.adviceWith(context, mock);
    }

    @Test
    @DirtiesContext
    public void test() throws Exception {

    }

    @Override
    protected Properties useOverridePropertiesWithPropertiesComponent() {
        InputStream input = ClassLoader.getSystemResourceAsStream("application.properties");
        Properties props = new Properties();
        try {
            props.load(input);
            props.put("spring.application.name", "application name");
        } catch (Exception e) {
            e.getMessage();
        }
        return props;
    }
}
