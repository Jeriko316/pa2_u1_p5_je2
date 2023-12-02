package com.uce.edu.inventario.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.inventario.repository.modelo.Bodega;
import com.uce.edu.transferencia.repository.modelo.CuentaBancaria;


@Repository
public class BodegaRepositoryImpl implements IBodegaRepository {

	private static List<Bodega> bodega = new ArrayList<Bodega>();
	
	@Override
	public Bodega seleccionar(String codigo) {
		for (Bodega bod : bodega) {
			if(bod.getCodigo().equals(codigo)) {
				Bodega bode = new Bodega();
				bode.setDireccion(bode.getDireccion());
				bode.setNombre(bode.getNombre());
				bode.setCapacidad(bode.getCapacidad());
				return bode;
			}
		}
		return null;
	}

	@Override
	public void insertar(Bodega bodega) {
		
		
	}

	@Override
	public void actualizar(Bodega bodega) {
	
		
	}

	@Override
	public void eliminar(String codigo) {
		
		
	}

	
	
}
