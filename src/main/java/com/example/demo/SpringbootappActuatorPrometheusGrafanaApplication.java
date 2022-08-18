package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootappActuatorPrometheusGrafanaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootappActuatorPrometheusGrafanaApplication.class, args);
	}

	@GetMapping
	 public  String Hello(){
		return  "Springboot App using Promestus and Grafana !!!!";
	}

}
