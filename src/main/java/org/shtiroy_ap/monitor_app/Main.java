package org.shtiroy_ap.monitor_app;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
