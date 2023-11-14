package com.uce.edu.io.di;

import java.math.BigDecimal;

import org.springframework.stereotype.Component; //debe pertenecer a sprinfawer y sterotype

@Component // se pone la anotacion a clases atributos y metodos (aqui decimos q STC q tome el control y empezamos a hacer Ioc)
public class Estudiante {

	private String cedula; //se usa string xq no se hace calculos usando integer 
	private String nombre;
	private String apellido;
	private BigDecimal salario; //big decimal se utiliza para valores monetarios, salario ,saldo ,valor de interes
	
	
	//getters y setters
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public BigDecimal getSalario() {
		return salario;
	}
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "Estudiante [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", salario=" + salario
				+ "]";
	}

	
}
