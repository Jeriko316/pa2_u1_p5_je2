package com.uce.edu.inventario.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.inventario.repository.modelo.Bodega;
import com.uce.edu.transferencia.repository.modelo.CuentaBancaria;


@Repository
public class BodegaRepositoryImpl implements IBodegaRepository {

	private static List<Bodega> listaBodega = new ArrayList<Bodega>();
	
	@Override
	public Bodega seleccionar(String codigo) {
		for (Bodega bod : listaBodega) {
			if(bod.getCodigo().equals(codigo)) {
				Bodega bodega = new Bodega();
				bodega.setDireccion(bod.getDireccion());
				bodega.setNombre(bod.getNombre());
				bodega.setCapacidad(bod.getCapacidad());
				return bod;
			}
		}
		return null;
	}

	@Override
	public void insertar(Bodega bodega) {
	  
		listaBodega.add(bodega);
	}

	@Override
	public void actualizar(Bodega bodega) {
	
		
	}

	@Override
	public void eliminar(String codigo) {
		
		
	}

	
	
}
