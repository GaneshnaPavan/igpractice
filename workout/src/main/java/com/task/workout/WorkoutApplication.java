package com.task.workout;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class WorkoutApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkoutApplication.class, args);
	}
	@Bean
	public ModelMapper modelmapper() {
		return new ModelMapper();
	}
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}


}
