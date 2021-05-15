import com.sun.net.httpserver.HttpServer;
import org.glassfish.jersey.jdkhttp.JdkHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import java.io.IOException;
import java.net.URI;

public class Main {

    final static String welcome = "Hello maintenanceMonitor!";

    public static void main(String[] args) {


        //welcome message
        System.out.println(getMessage());

        ResourceConfig rc = new ResourceConfig()
                .packages("at.huber.swlcm.maintenancemonitor.controllers");
        HttpServer server = JdkHttpServerFactory.createHttpServer(URI.create("http://localhost:8080/"), rc);
        System.out.println("Server started");

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

        server.stop(0);
    }

    public static String getMessage() {
        return welcome;
    }
}
