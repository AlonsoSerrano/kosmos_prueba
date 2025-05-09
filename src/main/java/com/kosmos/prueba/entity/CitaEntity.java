package com.kosmos.prueba.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TBL_CONSULTORIO")
public class CitaEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CITA_ID")
	private Integer citaID;

	@Column(name = "CONSULTORIO")
	public Integer consultorio;

	@Column(name = "DOCTOR")
	public String doctor;

	@Column(name = "HORARIO_CONSULTA")
	public String horarioConsulta;
	
	@Column(name = "NOMBRE_PACIENTE")
	public String nombrePaciente;

	public Integer getCitaID() {
		return citaID;
	}

	public void setCitaID(Integer citaID) {
		this.citaID = citaID;
	}

	

	public Integer getConsultorio() {
		return consultorio;
	}

	public void setConsultorio(Integer consultorio) {
		this.consultorio = consultorio;
	}

	public String getDoctor() {
		return doctor;
	}

	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	public String getHorarioConsulta() {
		return horarioConsulta;
	}

	public void setHorarioConsulta(String horarioConsulta) {
		this.horarioConsulta = horarioConsulta;
	}

	public String getNombrePaciente() {
		return nombrePaciente;
	}

	public void setNombrePaciente(String nombrePaciente) {
		this.nombrePaciente = nombrePaciente;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public CitaEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CitaEntity(Integer citaID, Integer consultorio, String doctor, String horarioConsulta,
			String nombrePaciente) {
		super();
		this.citaID = citaID;
		this.consultorio = consultorio;
		this.doctor = doctor;
		this.horarioConsulta = horarioConsulta;
		this.nombrePaciente = nombrePaciente;
	}
	
	
}
