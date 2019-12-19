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
@Table(name = "productos")
public class Producto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "FK_STARTUP_ID", referencedColumnName="id", nullable = false)
	private Startup startupProd;
	
	public Startup getStartupProd() {
		return startupProd;
	}

	public void setStartupProd(Startup startupProd) {
		this.startupProd = startupProd;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "producto_id_seq")
	@SequenceGenerator(name = "producto_id_seq", sequenceName = "producto_id_seq", initialValue = 1, allocationSize = 1)
	@Column(name = "ID", unique = true, nullable = false)
	private Long id;
	
	@Column(name = "NOMBRE", unique = true, nullable = false, length = 1000)
	private String nombre;
	
	@Column(name = "TIPOPLATAFORMA")
	private String tipoPlataforma;
	
	@Column(name = "TIPOSOLUCION")
	private String tipoSolucion;
	
	@Column(name = "DIRECCIONWEB", length = 1000)
	private String direccionWeb;
	
	@Column(name = "OBJETIVO", length = 1000)
	private String objetivo;
	
	@Column(name = "DIRECCIONAPP", length = 1000)
	private String direccionApp;
	
	@Column(name = "DIRECCIONPLAY", length = 1000)
	private String direccionPlay;
	
	@Column(name = "ASESORIASVALIDACION")
	private String asesoriasValidacion;
	
	@Column(name = "DESARROLLONEGOCIO")
	private String desarrolloNegocio;
	
	@Column(name = "INVESTIGACIONMERCADO")
	private String investigacionMercado;
	
	@Column(name = "ARQUITECTURAEMPRESARIAL")
	private String arquitecturaEmpresarial;
	
	@Column(name = "DESARROLLOPLAN")
	private String desarrolloPlan;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoPlataforma() {
		return tipoPlataforma;
	}

	public void setTipoPlataforma(String tipoPlataforma) {
		this.tipoPlataforma = tipoPlataforma;
	}

	public String getTipoSolucion() {
		return tipoSolucion;
	}

	public void setTipoSolucion(String tipoSolucion) {
		this.tipoSolucion = tipoSolucion;
	}

	public String getDireccionWeb() {
		return direccionWeb;
	}

	public void setDireccionWeb(String direccionWeb) {
		this.direccionWeb = direccionWeb;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	public String getDireccionApp() {
		return direccionApp;
	}

	public void setDireccionApp(String direccionApp) {
		this.direccionApp = direccionApp;
	}

	public String getDireccionPlay() {
		return direccionPlay;
	}

	public void setDireccionPlay(String direccionPlay) {
		this.direccionPlay = direccionPlay;
	}

	public String getAsesoriasValidacion() {
		return asesoriasValidacion;
	}

	public void setAsesoriasValidacion(String asesoriasValidacion) {
		this.asesoriasValidacion = asesoriasValidacion;
	}

	public String getDesarrolloNegocio() {
		return desarrolloNegocio;
	}

	public void setDesarrolloNegocio(String desarrolloNegocio) {
		this.desarrolloNegocio = desarrolloNegocio;
	}

	public String getInvestigacionMercado() {
		return investigacionMercado;
	}

	public void setInvestigacionMercado(String investigacionMercado) {
		this.investigacionMercado = investigacionMercado;
	}

	public String getArquitecturaEmpresarial() {
		return arquitecturaEmpresarial;
	}

	public void setArquitecturaEmpresarial(String arquitecturaEmpresarial) {
		this.arquitecturaEmpresarial = arquitecturaEmpresarial;
	}

	public String getDesarrolloPlan() {
		return desarrolloPlan;
	}

	public void setDesarrolloPlan(String desarrolloPlan) {
		this.desarrolloPlan = desarrolloPlan;
	}
}
