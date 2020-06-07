package com.deloitte.training.demo3;

import com.deloitte.training.demo3.model.Holiday3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Demo3ApplicationHolidays {

	@Bean
    public List<Holiday3> wibble2() {
        System.out.println("Holiday List in construction...");
        return Arrays.asList(
            new Holiday3("Ibiza",7),
            new Holiday3("Rome",5),
            new Holiday3("Thailand",21)
        );
	}
	
	// public static void main(String[] args) {
	// 	SpringApplication.run(Demo3ApplicationHolidays.class, args);
	// }

}