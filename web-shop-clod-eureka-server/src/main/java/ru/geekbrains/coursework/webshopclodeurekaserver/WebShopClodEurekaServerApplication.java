package ru.geekbrains.coursework.webshopclodeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class WebShopClodEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebShopClodEurekaServerApplication.class, args);
    }

}
