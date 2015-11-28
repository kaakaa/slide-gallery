package app;

import app.view.ThymeleafViewProcessor;
import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.mvc.MvcFeature;

import javax.ws.rs.ApplicationPath;

/**
 * Created by kaakaa_hoe on 2015/11/28.
 */
@ApplicationPath("/")
public class WebConfig extends ResourceConfig {
    public WebConfig() {
        packages(this.getClass().getPackage().getName());
        packages(this.getClass().getPackage().getName() + ".controller");

        register(ThymeleafViewProcessor.class);
        register(MvcFeature.class);
        register(LoggingFilter.class);
    }
}
