package com.test.herokudeploytest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAutoConfiguration
@RestController
@RequestMapping(value = "/")
public class HerokuDeployTestApplication {

	@GetMapping("/hello")
	public ResponseEntity<?> getHello(){
		return new ResponseEntity<>("Hello World", HttpStatus.OK);
	}

	public static void main(String[] args) {
		SpringApplication.run(HerokuDeployTestApplication.class, args);
	}

}
