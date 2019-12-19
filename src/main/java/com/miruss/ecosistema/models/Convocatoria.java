package com.miruss.ecosistema.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "convocatorias")
public class Convocatoria implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@OneToMany(mappedBy = "convocatoriaApli", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Convocatoria_Startup> startups;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "FK_ENTIDAD_ID", referencedColumnName="id", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Entidad entidadCon;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "FK_REQUISITOS_ID", referencedColumnName = "id")
	private Requisitos requisitos;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "convocatoria_id_seq")
	@SequenceGenerator(name = "convocatoria_id_seq", sequenceName = "convocatoria_id_seq", initialValue = 1, allocationSize = 1)
	@Column(name = "ID", unique = true, nullable = false)
	private Long id;
	
	@Column(name = "IMAGEN", length = 10485760)
	private String imagen;
	
	@Column(name = "NOMBRE", unique = true, nullable = false, length = 1000)
	private String nombre;
	
	@Column(name = "ESTADO", nullable = false)
	private String estado;
	
	@Column(name = "APERTURA")
	private String apertura;
	
	@Column(name = "CIERRE")
	private String cierre;
	
	@Column(name = "PROPOSITO", nullable = false, length = 1000)
	private String proposito;
	
	@Column(name = "DIRIGIDO", length = 1000)
	private String dirigido;
	
	@Column(name = "NIVEL", length = 1000)
	private String nivel;

	@Column(name = "RECURSOS", length = 1000)
	private String recursos;
	
	@Column(name = "BENEFICIOS", length = 1000)
	private String beneficios;
	
	@Column(name = "DESCRIPCION_PROCESOS", length = 1000)
	private String descripcionProceso;
	
	@Column(name = "FACEBOOK", length = 1000)
	private String facebookC;
	
	@Column(name = "LINKEDL", length = 1000)
	private String linkedlnC;

	@Column(name = "TWITTER", length = 1000)
	private String twitterC;
	
	@Column(name = "WHATSAPP", length = 1000)
	private String whatsappC;
	
	@Column(name = "INSTAGRAM", length = 1000)
	private String instagramC;
	
	@Column(name = "WEB_OFICIAL", length = 1000)
	private String webOficial;
	
	@Column(name = "CORREO_OFICIAL", length = 1000)
	private String correoOficial;
	
	@Column(name = "NUMERO", length = 1000)
	private String numero;
	
	@Column(name = "CANTIDAD_QUE_APLICA")
	private int cantidadAplica;
	
	@Column(name = "CANTIDAD_QUE_PUEDEN_APLICA")
	private int cantidadPuedenAplicar;
	
	@Column(name = "TERMINOS")
	private String terminos;
	
	@Column(name = "RESPUESTAS")
	private String respuestas;
	
	@Column(name = "ANEXOS")
	private String anexos;
	
	@Column(name = "OTROSDOCUMENTOS")
	private String otrosDocumentos;
	
	public String getTerminos() {
		return terminos;
	}

	public void setTerminos(String terminos) {
		this.terminos = terminos;
	}

	public String getRespuestas() {
		return respuestas;
	}

	public void setRespuestas(String respuestas) {
		this.respuestas = respuestas;
	}

	public String getAnexos() {
		return anexos;
	}

	public void setAnexos(String anexos) {
		this.anexos = anexos;
	}

	public String getOtrosDocumentos() {
		return otrosDocumentos;
	}

	public void setOtrosDocumentos(String otrosDocumentos) {
		this.otrosDocumentos = otrosDocumentos;
	}

	public Entidad getEntidadCon() {
		return entidadCon;
	}

	public int getCantidadPuedenAplicar() {
		return cantidadPuedenAplicar;
	}

	public void setCantidadPuedenAplicar(int cantidadPuedenAplicar) {
		this.cantidadPuedenAplicar = cantidadPuedenAplicar;
	}

	public void setEntidadCon(Entidad entidadCon) {
		this.entidadCon = entidadCon;
	}

	public int getCantidadAplica() {
		return cantidadAplica;
	}

	public void setCantidadAplica(int cantidadAplica) {
		this.cantidadAplica = cantidadAplica;
	}

	public Requisitos getRequisitos() {
		return requisitos;
	}

	public void setRequisitos(Requisitos requisitos) {
		this.requisitos = requisitos;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public List<Convocatoria_Startup> getStartups() {
		return startups;
	}

	public void setStartups(List<Convocatoria_Startup> startups) {
		this.startups = startups;
	}

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

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getApertura() {
		return apertura;
	}

	public void setApertura(String apertura) {
		this.apertura = apertura;
	}

	public String getCierre() {
		return cierre;
	}

	public void setCierre(String cierre) {
		this.cierre = cierre;
	}

	public String getProposito() {
		return proposito;
	}

	public void setProposito(String proposito) {
		this.proposito = proposito;
	}

	public String getDirigido() {
		return dirigido;
	}

	public void setDirigido(String dirigido) {
		this.dirigido = dirigido;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getRecursos() {
		return recursos;
	}

	public void setRecursos(String recursos) {
		this.recursos = recursos;
	}

	public String getBeneficios() {
		return beneficios;
	}

	public void setBeneficios(String beneficios) {
		this.beneficios = beneficios;
	}
	
	public String getDescripcionProceso() {
		return descripcionProceso;
	}

	public void setDescripcionProceso(String descripcionProceso) {
		this.descripcionProceso = descripcionProceso;
	}
	
	public String getFacebookC() {
		return facebookC;
	}

	public void setFacebookC(String facebookC) {
		this.facebookC = facebookC;
	}

	public String getLinkedlnC() {
		return linkedlnC;
	}

	public void setLinkedlnC(String linkedlnC) {
		this.linkedlnC = linkedlnC;
	}

	public String getTwitterC() {
		return twitterC;
	}

	public void setTwitterC(String twitterC) {
		this.twitterC = twitterC;
	}

	public String getWhatsappC() {
		return whatsappC;
	}

	public void setWhatsappC(String whatsappC) {
		this.whatsappC = whatsappC;
	}

	public String getInstagramC() {
		return instagramC;
	}

	public void setInstagramC(String instagramC) {
		this.instagramC = instagramC;
	}

	public String getWebOficial() {
		return webOficial;
	}

	public void setWebOficial(String webOficial) {
		this.webOficial = webOficial;
	}

	public String getCorreoOficial() {
		return correoOficial;
	}

	public void setCorreoOficial(String correoOficial) {
		this.correoOficial = correoOficial;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
}
