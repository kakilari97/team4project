package com.capgemini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.capgemini")
public class CapgeministoreUiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CapgeministoreUiApplication.class, args);
	}
}
