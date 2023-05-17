package com.segways.segways;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.segways.segways.controller.SegwaysController;

@SpringBootApplication
public class SegwaysApplication {

	public static void main(String[] args) {
		SpringApplication.run(SegwaysApplication.class, args);
	}
}
