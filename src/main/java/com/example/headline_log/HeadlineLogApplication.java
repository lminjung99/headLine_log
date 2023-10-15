package com.example.headline_log;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HeadlineLogApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeadlineLogApplication.class, args);
		
		System.out.println("print test");
		Path currentWorkingDir = Paths.get("").toAbsolutePath();
		System.out.println("Root dir : "+currentWorkingDir);
	}

}
