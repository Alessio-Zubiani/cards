package com.eazybytes.cards;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
	
	@Bean
    public GroupedOpenApi publicApi() {
		String[] paths = {"/**"};
	    return GroupedOpenApi.builder()
	    		.group("Actuator")
	            .pathsToMatch(paths)
	            .build();
    }

}
