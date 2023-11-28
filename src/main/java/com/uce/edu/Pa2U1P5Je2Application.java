package com.uce.edu;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.transferencia.repository.modelo.CuentaBancaria;
import com.uce.edu.transferencia.repository.modelo.Transferencia;
import com.uce.edu.transferencia.service.ICuentaBancariaService;
import com.uce.edu.transferencia.service.ITransferenciaService;

@SpringBootApplication
public class Pa2U1P5Je2Application implements CommandLineRunner {
	
	/*@Autowired // aqui damos la orden y decimos de q clase debe elegir 
	private Estudiante estudiante;*/
	
	/*@Autowired // aqui damos la orden y decimos de q clase debe elegir 
	private Materia materia;
	
	@Autowired // aqui damos la orden y decimos de q clase debe elegir 
	private Materia materia1;
	
	@Autowired // aqui damos la orden y decimos de q clase debe elegir 
	private Materia materia2;*/


	
	
	@Autowired
	private ITransferenciaService iTransferenciaService;
	
	@Autowired
	private ICuentaBancariaService bancariaService;

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
		
		/*this.materia.setNombre("Avanzada II");
		System.out.println(this.materia);
		
		System.out.println(this.materia1);
		
		this.materia1.setNombre("nuevo nombre");
		System.out.println(this.materia1);
		System.out.println(this.materia);
		
		this.materia2.setNombre("nombre final");
		System.out.println(this.materia2);*/
		
		
		//1.Crear Cuenta
		CuentaBancaria ctaOrigen = new CuentaBancaria();
		ctaOrigen.setCedulaPropietario("0401213053");
		ctaOrigen.setNumero("1234");
		ctaOrigen.setSaldo(new BigDecimal(100));
		this.bancariaService.guardar(ctaOrigen);
		
		
		CuentaBancaria ctaDestino = new CuentaBancaria();
		ctaDestino.setCedulaPropietario("1728987897");
		ctaDestino.setNumero("5678");
		ctaDestino.setSaldo(new BigDecimal(200));
		this.bancariaService.guardar(ctaDestino);
		
		
		this.iTransferenciaService.realizar("1234","5678",new BigDecimal(20));
		//System.out.println(ctaOrigen);
		//System.out.println(ctaDestino);
		
		
		
		
		this.iTransferenciaService.realizar("1234","5678",new BigDecimal(50));
		this.iTransferenciaService.realizar("1234","5678",new BigDecimal(10));
		this.iTransferenciaService.realizar("1234","5678",new BigDecimal(18));
		this.iTransferenciaService.realizar("1234","5678",new BigDecimal(1));

		
		 List<Transferencia> lista = this.iTransferenciaService.buscarTodos();

		//Contruir un reporte del estado de cuenta de todas las transferencia
		int indice = 0;
		for(Transferencia trans: lista) {
			indice++;
			System.out.println("Numero de transacion ->"+indice + ":\n" + trans);
		}
		
		/*CuentaBancaria ctaOrigen1 = this.bancariaService.buscar("1234"); 
		System.out.println(ctaOrigen1);
		
		CuentaBancaria ctaDestino1 = this.bancariaService.buscar("5678"); 
		System.out.println(ctaDestino1);*/
		
	}

}
