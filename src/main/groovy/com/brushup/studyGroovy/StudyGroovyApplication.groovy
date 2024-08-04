package com.brushup.studyGroovy

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.web.client.RestTemplate

@SpringBootApplication
class StudyGroovyApplication {

	static void main(String[] args) {
		SpringApplication.run(StudyGroovyApplication, args)
	}

	@Bean
	RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
}
