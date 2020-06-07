package com.deloitte.training.demo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Demo3Application {

	@Bean
    public List<Holiday> wibble() {
        System.out.println("Holiday List in construction...");
        return Arrays.asList(
            new Holiday("Ibiza",7),
            new Holiday("Rome",5),
            new Holiday("Thailand",21)
        );
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Demo3Application.class, args);
	}

}