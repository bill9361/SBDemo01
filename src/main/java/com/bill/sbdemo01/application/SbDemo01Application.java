package com.bill.sbdemo01.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.bill.sbdemo01.controller.*","com.bill.sbdemo01.application"})
public class SbDemo01Application {

	public static void main(String[] args) {
		SpringApplication.run(SbDemo01Application.class, args);
	}
}
