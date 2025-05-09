package com.kosmos.prueba.service;

import java.util.List;

import com.kosmos.prueba.dto.CitaDTO;


public interface CitaService {

	public void registrarCita(CitaDTO dto);
	public List<CitaDTO> getCitas(String doctor);
}
