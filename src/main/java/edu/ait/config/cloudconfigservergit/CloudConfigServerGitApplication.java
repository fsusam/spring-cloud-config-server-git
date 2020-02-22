package edu.ait.config.cloudconfigservergit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class CloudConfigServerGitApplication {

    public static void main(final String[] args) {
        SpringApplication.run(CloudConfigServerGitApplication.class, args);
    }

}
