package com.servicio.epy.productos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class SbServicioProductosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbServicioProductosApplication.class, args);
	}

}
