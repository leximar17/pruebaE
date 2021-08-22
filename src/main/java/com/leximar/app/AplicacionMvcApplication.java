package com.leximar.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.leximar.app.model.Cliente;

@SpringBootApplication
public class AplicacionMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(AplicacionMvcApplication.class, args);
		
		Cliente c = new Cliente();
		
	}

}
