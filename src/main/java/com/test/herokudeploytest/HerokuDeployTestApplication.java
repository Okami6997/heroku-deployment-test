package com.test.herokudeploytest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class HerokuDeployTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(HerokuDeployTestApplication.class, args);
	}

}
