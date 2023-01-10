package com.example.demo;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;

@SpringBootApplication
public class StorageApplication {



	public static void main(String[] args) {SpringApplication.run(StorageApplication.class, args);
		System.out.println("StorageApplication.main");
	}
}