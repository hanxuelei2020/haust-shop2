package com.example.nativeexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(proxyBeanMethods = false)
@EnableJpaRepositories
public class NativeExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(NativeExampleApplication.class, args);
	}

}
