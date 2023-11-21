package com.uce.edu;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.io.di.Estudiante;
import com.uce.edu.repository.modelo.Materia;

@SpringBootApplication
public class Pa2U1P5Je2Application implements CommandLineRunner {
	
	/*@Autowired // aqui damos la orden y decimos de q clase debe elegir 
	private Estudiante estudiante;*/
	
	@Autowired // aqui damos la orden y decimos de q clase debe elegir 
	private Materia materia;
	
	@Autowired // aqui damos la orden y decimos de q clase debe elegir 
	private Materia materia1;
	
	@Autowired // aqui damos la orden y decimos de q clase debe elegir 
	private Materia materia2;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P5Je2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*this.estudiante.setNombre("erick");
		this.estudiante.setApellido("enriquez");
		this.estudiante.setCedula("0401213053");
		this.estudiante.setSalario(new BigDecimal(100));
		System.out.println(estudiante);*/
		
		this.materia.setNombre("Avanzada II");
		System.out.println(this.materia);
		
		System.out.println(this.materia1);
		
		this.materia1.setNombre("nuevo nombre");
		System.out.println(this.materia1);
		System.out.println(this.materia);
		
		this.materia2.setNombre("nombre final");
		System.out.println(this.materia2);
	}

}
