package com.gcu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.gcu.model.ProductModel;

@SpringBootApplication
@ComponentScan("com.gcu")
public class CshCharmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CshCharmsApplication.class, args);
		
	}

}
