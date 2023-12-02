package com.uce.edu.inventario.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.inventario.repository.modelo.Inventario;

@Repository
public class InventarioRepositoryImpl implements IInventarioRepository {

	@Override
	public Inventario seleccionar(String codigo) {

		return null;
	}

	@Override
	public void insertar(Inventario Inventario) {

	}

	@Override
	public void actualizar(Inventario Inventario) {

	}

	@Override
	public void eliminar(String codigo) {

	}

}
