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
public class ConsultorioEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CONSULTORIO_ID")
	private Integer consultorioId;

	@Column(name = "NUMERO")
	private Integer numero;

	@Column(name = "PISO")
	private Integer piso;

	

	public Integer getConsultorioId() {
		return consultorioId;
	}



	public void setConsultorioId(Integer consultorioId) {
		this.consultorioId = consultorioId;
	}



	public Integer getNumero() {
		return numero;
	}



	public void setNumero(Integer numero) {
		this.numero = numero;
	}



	public Integer getPiso() {
		return piso;
	}



	public void setPiso(Integer piso) {
		this.piso = piso;
	}



	public ConsultorioEntity(Integer consultorioId, Integer numero, Integer piso) {
		super();
		this.consultorioId = consultorioId;
		this.numero = numero;
		this.piso = piso;
	}



	public ConsultorioEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
