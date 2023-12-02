package com.uce.edu.inventario.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.inventario.repository.modelo.Producto;

@Repository
public class ProductoRepositoryImpl implements IProductoRepository{

	@Override
	public Producto seleccionar(String codigoBarras) {
		
		
		return null;
	}

	@Override
	public void insertar(Producto producto) {
		
	}

	@Override
	public void actualizar(Producto producto) {
		
	}

	@Override
	public void eliminar(String codigoBarras) {
		
	}

	
	
}
