package com.kosmos.prueba.dto;

import jakarta.validation.constraints.NotNull;

public class DoctorDTO {

	private Integer doctorId;
	@NotNull(message = "El nombre no puede ser nulo")
	private String nombre;
	@NotNull(message = "El apellido paterno no puede ser nulo")
	private String apellidoPaterno;
	private String apellidoMaterno;
	@NotNull(message = "La especialidad no puede ser nulo")
	private String especialidad;
	
	
	public DoctorDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public DoctorDTO(Integer doctorId, String nombre, String apellidoPaterno, String apellidoMaterno,
			String especialidad) {
		super();
		this.doctorId = doctorId;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.especialidad = especialidad;
	}
	public Integer getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	


}
