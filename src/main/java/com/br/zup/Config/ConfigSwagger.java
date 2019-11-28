package com.br.zup.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;


@Configuration
@EnableSwagger2
public class ConfigSwagger {

	  @Bean
	  public Docket greetingApi() {
	    return new Docket(DocumentationType.SWAGGER_2)
	        .select()
	        .apis(RequestHandlerSelectors.basePackage("package Promotions"))
	        .build()
	        .apiInfo(metaInfo());

	  }

	  private ApiInfo metaInfo() {
	    
		  ApiInfo apiInfo = new ApiInfo(
	        "People API REST",
	        "Api for establishment registration and promotions. ",
	        "1.0",
	        "Terms of Service",
	        new Contact(" Brenda Alexia", "https://github.com/lexie2510",
	        		"brenda.lima@zup.com.br"),
	        "Apache License Version 2.0",
	        "http://www.apache.org/licesen.html",new ArrayList<VendorExtension>()
	        );
		  
		  return apiInfo;
	  }	
	}