package com.uce.edu.inventario.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.inventario.repository.modelo.Bodega;


@Service
public class BodegaServiceImpl implements IBodegaService{

	@Autowired
	private IBodegaService iBodegaRepository;
	
	@Override
	public Bodega buscar(String codigo) {
		return this.iBodegaRepository.buscar(codigo);
	}

	@Override
	public void guardar(Bodega bodega) {
		// TODO Auto-generated method stub
		this.iBodegaRepository.guardar(bodega);
	}

	@Override
	public void actualizar(Bodega bodega) {
		// TODO Auto-generated method stub
		this.iBodegaRepository.actualizar(bodega);
	}

	@Override
	public void eliminar(Bodega bodega) {
		// TODO Auto-generated method stub
		this.iBodegaRepository.eliminar(bodega);
	}

}
