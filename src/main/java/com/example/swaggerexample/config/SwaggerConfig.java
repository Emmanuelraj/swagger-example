package com.example.swaggerexample.config;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;



@EnableSwagger2
@Configuration
public class SwaggerConfig {

	
	
	/**
	 * create a documentation for particular companent scan and their endPoints
	 */
	
	@Bean
	public Docket productApi()
	{
		 return new Docket(DocumentationType.SWAGGER_2)
	                .select()
	                .apis(RequestHandlerSelectors.basePackage("com.example.swaggerexample"))
	                .paths(regex("/rest.*"))
	                .build()
	                .apiInfo(metaInfo());
		 
		 //for custom documentation add .apiInfo(metaInfo())
	  }

	private ApiInfo metaInfo() {
		// TODO Auto-generated method stub
		ApiInfo apiInfo = new ApiInfo( "Spring Boot Swagger Example API",
                "Spring Boot Swagger Example API for Youtube",
                "1.0",
                "Terms of Service",
                new Contact("Emmanuel Raj", "",
                        "immanuel.raj18@gmail.com"),
                "Apache License Version 2.0",
                "https://www.apache.org/licesen.html");
				
				return apiInfo;
	}
	
}
