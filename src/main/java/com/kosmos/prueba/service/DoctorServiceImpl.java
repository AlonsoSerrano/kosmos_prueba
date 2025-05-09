package com.kosmos.prueba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kosmos.prueba.dto.DoctorDTO;
import com.kosmos.prueba.entity.DoctorEntity;
import com.kosmos.prueba.repository.DoctorRepositoryDAO;


@Service
public class DoctorServiceImpl implements DoctorService{

	@Autowired
	DoctorRepositoryDAO doctorRepositoryDAO;
	
	@Override
	public void registroDoctor(DoctorDTO dto) {
		DoctorEntity doctor = new DoctorEntity();
		
		doctor.setNombre(dto.getNombre());
		doctor.setApellidoPaterno(dto.getApellidoPaterno());
		doctor.setApelidoMaterno(dto.getApellidoMaterno());
		doctor.setEspecialidad(dto.getEspecialidad());

		
		   try {
				doctorRepositoryDAO.save(doctor);
		    } catch (Exception e) {
		        throw new RuntimeException("Error al registrar el doctor", e);
		    }
	}

}
