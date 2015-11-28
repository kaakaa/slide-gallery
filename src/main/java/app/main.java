package app;

import com.sun.net.httpserver.HttpServer;
import org.glassfish.jersey.jdkhttp.JdkHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import java.net.URI;

/**
 * Created by kaakaa_hoe on 2015/11/28.
 */
public class Main {
    public static void main(String[] args) {
        URI uri = URI.create("http://localhost:8080/rest/");

        ResourceConfig rc = new ResourceConfig();
        rc.register(Calc.class);

        HttpServer httpServer = JdkHttpServerFactory.createHttpServer(uri, rc);
        Runtime.getRuntime().addShutdownHook(new Thread(() -> httpServer.stop(0)));

        System.out.println("JAX-RS started");
    }
}
