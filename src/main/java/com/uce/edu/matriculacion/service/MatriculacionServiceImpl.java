package com.uce.edu.matriculacion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.matriculacion.repository.IPropietarioRepository;
import com.uce.edu.matriculacion.repository.IVehiculoRepository;
import com.uce.edu.matriculacion.repository.modelo.Vehiculo;

@Service
public class MatriculacionServiceImpl implements IMatriculacionService {

	@Autowired
	private IVehiculoRepository iVehiculoRepository;
	
	@Autowired
	private IPropietarioRepository iPropietarioRepository;

	
	@Override
	public void matricular(String numPlaca, String propietario) {

		iVehiculoRepository.buscar(numPlaca);

		
	}

	
}


