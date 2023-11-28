package com.uce.edu.transferencia.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.transferencia.repository.ICuentaBancariaRepository;
import com.uce.edu.transferencia.repository.modelo.CuentaBancaria;

@Service
public class CuentaBancariaImpl implements ICuentaBancariaService {

	@Autowired
	private ICuentaBancariaRepository bancariaRepository;
	
	@Override
	public CuentaBancaria buscar(String numero) {
		// TODO Auto-generated method stub
		return this.bancariaRepository.seleccionar(numero);
		
	}

	@Override
	public void guardar(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		this.bancariaRepository.insertar(cuentaBancaria);
	}

	@Override
	public void actualizar(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		this.bancariaRepository.actualizar(cuentaBancaria);
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		this.bancariaRepository.eliminar(numero);
	}

	@Override
	public void depositar(String cta, BigDecimal monto) {
		// TODO Auto-generated method stub
		//BigDecimal porc = (0.9); 
		//monto = monto.multiply(porc);
	}

}
