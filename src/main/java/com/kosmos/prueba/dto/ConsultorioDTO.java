package com.kosmos.prueba.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ConsultorioDTO {

	public Integer id_consultorio;
	
	@NotNull(message = "El numero no puede ser nulo")
	public Integer numero;
	
	@NotNull(message = "El piso no puede ser nulo")
	public Integer piso;
	
	
}
