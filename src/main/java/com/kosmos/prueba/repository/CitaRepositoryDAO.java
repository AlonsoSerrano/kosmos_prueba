package com.kosmos.prueba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kosmos.prueba.dto.CitaDTO;
import com.kosmos.prueba.entity.CitaEntity;


public interface CitaRepositoryDAO extends JpaRepository<CitaEntity, Integer>{

	
	  @Query(value="SELECT NEW com.kosmos.prueba.entity.CitaEntity( "
			+ "c.citaID, "
			+ "c.consultorio, "
			+ "c.doctor, "
		  	+ "c.horarioConsulta, "
		  	+ "c.nombrePaciente, "
			+ "FROM CitaEntity c "
			+ "WHERE c.doctor = :doctor ")
	  List<CitaDTO> getCitas(String doctor);
}
