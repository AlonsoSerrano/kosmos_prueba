package com.kosmos.prueba.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kosmos.prueba.dto.CitaDTO;
import com.kosmos.prueba.entity.CitaEntity;
import com.kosmos.prueba.repository.CitaRepositoryDAO;

import co.gov.creg.ms_registro.exception.NotFoundException;

@Service
public class CitaServiceImpl implements CitaService{

	@Autowired
	CitaRepositoryDAO citaRepositoryDAO;
	
	@Override
	public void registrarCita(CitaDTO dto) {
		CitaEntity cita = new CitaEntity();
		cita.setConsultorio(dto.consultorio);
		cita.setDoctor(dto.doctor);
		cita.setHorarioConsulta(dto.horarioConsulta);
		cita.setNombrePaciente(dto.nombrePaciente);
		
		   try {
			   citaRepositoryDAO.save(cita);
		    } catch (Exception e) {
		        throw new RuntimeException("Error al crear la cita", e);
		    }
	}

	@Override
	public List<CitaDTO> getCitas(String doctor) {
		List<CitaDTO> result = new ArrayList<>();
		result = citaRepositoryDAO.getCitas(doctor);

		if (result.size() == 0 || result.isEmpty()) {
			throw new NotFoundException("No se obtuvieron Solicitudes Pendientes");
		}
		return result;
	}
	}


