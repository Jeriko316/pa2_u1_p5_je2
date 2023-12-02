package com.uce.edu.inventario.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.inventario.repository.modelo.Producto;

@Service
public class ProductoServiceImpl implements IProductoService {

	@Autowired
	private IProductoService iProductoRepository;
	
	@Override
	public Producto buscar(String codigoBarras) {
		return this.iProductoRepository.buscar(codigoBarras);
	}

	@Override
	public void guardar(Producto producto) {
		// TODO Auto-generated method stub
		this.iProductoRepository.guardar(producto);
	}

	@Override
	public void actualizar(Producto producto) {
		// TODO Auto-generated method stub
		this.iProductoRepository.actualizar(producto);
	}

	@Override
	public void eliminar(Producto producto) {
		// TODO Auto-generated method stub
		this.iProductoRepository.eliminar(producto);
	}

}
