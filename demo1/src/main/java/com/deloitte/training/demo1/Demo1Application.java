package com.deloitte.training.demo1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Demo1Application {

	@Bean
	public CommandLineRunner foobar () {
		return args -> System.out.println("Anybody out there???");

	}

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

}
