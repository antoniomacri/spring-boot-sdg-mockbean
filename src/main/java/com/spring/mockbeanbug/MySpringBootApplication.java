package com.spring.mockbeanbug;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
@ImportResource({"classpath:/cache-config.xml"})
@Slf4j
public class MySpringBootApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(MySpringBootApplication.class);
        app.run(args);
    }
}
