package com.kosmos.prueba.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class CitaDTO {

	public Integer citaId;
	
	@NotNull(message = "El consultorio no puede ser nulo")
	public Integer consultorio;
	
	@NotNull(message = "El nombre del doctor no puede ser nulo")
	public String doctor;
	
	@NotNull(message = "El hoario no puede ser nulo")
	public String horarioConsulta;
	
	@NotNull(message = "El nombre del paciente no puede ser nulo")
	public String nombrePaciente;
}
