package com.deloitte.training.demo3;

import com.deloitte.training.demo3.model.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Demo3Application {
	@Bean
	public List<Person> wibble() {
		System.out.println("Person factory method called...");
		return Arrays.asList(
				new Person("Jane", 25),
				new Person("Dave", 26),
				new Person("Mary", 27),
				new Person("Pete", 28)
		);
	}

	public static void main(String[] args) {
		SpringApplication.run(Demo3Application.class, args);
	}

}
