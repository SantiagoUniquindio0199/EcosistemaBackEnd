package com.miruss.ecosistema.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "convocatoria_startup")
public class Convocatoria_Startup implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "convocatoria_startup_seq_id")
	@SequenceGenerator(name = "convocatoria_startup_seq_id", sequenceName = "convocatoria_startup_seq_id", allocationSize = 1, initialValue = 1)
	@Column(name = "ID", unique = true, nullable = false)
	private Long id;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "FK_CONVOCATORIA_ID", referencedColumnName="id", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Convocatoria convocatoriaApli;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "FK_STARTUP_ID", referencedColumnName="id", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Startup startupApli;
	
	@Column(name = "APLICO", nullable = false)
	private String aplico;
	
	@Column(name = "PORCENTAJE_FALTANTE", nullable = false)
	private int porcentaje;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Convocatoria getConvocatoriaApli() {
		return convocatoriaApli;
	}

	public void setConvocatoriaApli(Convocatoria convocatoriaApli) {
		this.convocatoriaApli = convocatoriaApli;
	}

	public Startup getStartupApli() {
		return startupApli;
	}

	public void setStartupApli(Startup startupApli) {
		this.startupApli = startupApli;
	}

	public String getAplico() {
		return aplico;
	}

	public void setAplico(String aplico) {
		this.aplico = aplico;
	}

	public int getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(int porcentaje) {
		this.porcentaje = porcentaje;
	}
	
}
