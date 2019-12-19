package com.miruss.ecosistema;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@PropertySource("classpath:message.properties")
public class EcosistemaApplication{

	public static void main(String[] args) {
		SpringApplication.run(EcosistemaApplication.class, args);
	}

}
