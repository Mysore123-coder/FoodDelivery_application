package com.cg.fda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import static springfox.documentation.builders.PathSelectors.regex;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class FoodDeliveryApplication extends SpringBootServletInitializer{
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
    return builder.sources(FoodDeliveryApplication.class);
    }
	public static void main(String[] args) {
		SpringApplication.run(FoodDeliveryApplication.class, args);
	}

	//@Bean
	//public Docket postsApi() {
	//	return new Docket(DocumentationType.SWAGGER_2).apiInfo(metadata()).select().paths(regex("/fooddelivery.*")).build();
	//}

	//@SuppressWarnings("deprecation")
	//private ApiInfo metadata() {
		//return new ApiInfoBuilder().title("Food Delivery Application").description("API reference guide for Admin module of Food Delivery Application")
		//		.termsOfServiceUrl("https://www.javafooddeliveryapps.com/").contact("Amrutha R").version("2.0").build();	
	//}
}
