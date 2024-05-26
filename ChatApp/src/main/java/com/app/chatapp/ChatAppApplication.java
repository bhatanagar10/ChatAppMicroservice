package com.app.chatapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import java.util.Properties;

@SpringBootApplication
@EnableDiscoveryClient
public class ChatAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChatAppApplication.class, args);
      /*  new SpringApplicationBuilder(ChatAppApplication.class).sources(ChatAppApplication.class).properties(getProperties())
                .run(args);*/
    }

/*    static Properties getProperties() {
        Properties props = new Properties();
        String externalConfigDir = "file:///chatapp/";
        String applicationYml = externalConfigDir + "application.yml";
        String applicationDockerYml = externalConfigDir + "application-docker.yml";

        props.put("spring.config.location", applicationYml + "," + applicationDockerYml);*//*
        props.put("spring.config.location", "classpath:application.yml");
        return props;
    }*/
}
