package com.rancho_smart.produccion_composer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProduccionComposerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProduccionComposerApplication.class, args);
	}

}
