package com.uce.edu.repository;

import com.uce.edu.repository.modelo.Materia;//ctr shif o



public interface IMateriaRepository {

	public Materia seleccionar(String codigo);//metodo para leer
	public void insertar(Materia materia);
	public void actualizar(Materia materia);
	public void borrar(String codigo);
	
	
}
