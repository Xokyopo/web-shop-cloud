package ru.geekbrains.coursework.webshopclouddomain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication
public class WebShopCloudDomainApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebShopCloudDomainApplication.class, args);
	}

}
