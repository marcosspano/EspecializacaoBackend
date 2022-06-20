package com.dh.repositorio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RepositorioApplication {

	public static void main(String[] args) {
		SpringApplication.run(RepositorioApplication.class, args);
	}

}
