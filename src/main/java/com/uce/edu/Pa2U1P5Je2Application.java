package com.uce.edu;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.io.di.Estudiante;

@SpringBootApplication
public class Pa2U1P5Je2Application implements CommandLineRunner {
	
	@Autowired // aqui damos la orden y decimos de q clase debe elegir 
	private Estudiante estudiante;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P5Je2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		this.estudiante.setNombre("erick");
		this.estudiante.setApellido("enriquez");
		this.estudiante.setCedula("0401213053");
		this.estudiante.setSalario(new BigDecimal(100));
		System.out.println(estudiante);
	}

}
