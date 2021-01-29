package ru.geekbrains.coursework.webshopclouddomain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class WebShopCloudDomainApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebShopCloudDomainApplication.class, args);
	}

}
