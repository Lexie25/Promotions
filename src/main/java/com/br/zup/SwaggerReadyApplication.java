package com.br.zup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class SwaggerReadyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerReadyApplication.class, args);
	}
	

}
