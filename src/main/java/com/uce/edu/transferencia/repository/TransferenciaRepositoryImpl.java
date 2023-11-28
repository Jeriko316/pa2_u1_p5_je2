package com.uce.edu.transferencia.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.transferencia.repository.modelo.Transferencia;

@Repository
public class TransferenciaRepositoryImpl implements ITranferenciaRepository {
	private static List<Transferencia> base = new ArrayList<Transferencia>();
	@Override
	public Transferencia seleccionar(String numero) {
		// TODO Auto-generated method stub
		
		for (Transferencia transfer : base) {
			if(transfer.getNumero().equals(numero)) {
				return transfer;
			}
		}
		return null;
	}

	@Override
	public void insertar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		base.add(transferencia);
	}

	@Override
	public void actualizar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		this.eliminar(transferencia.getNumero());
		this.insertar(transferencia);
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Transferencia> seleccionarTodos() {
		// TODO Auto-generated method stub
		return base;
	}

}
