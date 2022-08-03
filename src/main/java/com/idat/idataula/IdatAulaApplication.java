package com.idat.idataula;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class IdatAulaApplication {

	public static void main(String[] args) {
		SpringApplication.run(IdatAulaApplication.class, args);
	}

}
