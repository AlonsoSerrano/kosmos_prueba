package com.kosmos.prueba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kosmos.prueba.dto.ConsultorioDTO;
import com.kosmos.prueba.entity.ConsultorioEntity;
import com.kosmos.prueba.repository.ConsultorioRepositoryDAO;

@Service
public class ConsultorioServiceImpl implements ConsultorioService{

	@Autowired
	ConsultorioRepositoryDAO consultorioRepositoryDAO;
	
	@Override
	public void crearConsultorio(ConsultorioDTO dto) {

		ConsultorioEntity consultorio = new ConsultorioEntity();
		consultorio.setNumero(dto.piso);
		consultorio.setPiso(dto.piso);
		
		   try {
		        consultorioRepositoryDAO.save(consultorio);
		    } catch (Exception e) {
		        throw new RuntimeException("Error al crear el consultorio", e);
		    }
	}

}
