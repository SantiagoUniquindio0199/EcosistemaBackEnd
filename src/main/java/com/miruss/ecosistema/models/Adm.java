package com.miruss.ecosistema.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "adm")
public class Adm implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "adm_id_seq")
	@SequenceGenerator(name = "adm_id_seq", sequenceName = "adm_id_seq", initialValue = 1, allocationSize = 1)
	@Column(name = "ID", unique = true, nullable = false)
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "CORREO", nullable = false, unique = true)
	private String cor;
	
	@Column(name = "CONTRASENA", nullable = false)
	private String con;
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCon() {
		return con;
	}

	public void setCon(String con) {
		this.con = con;
	}
}
