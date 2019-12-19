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
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "entidades")
public class Entidad implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@OneToMany(mappedBy = "entidadCon" , fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Convocatoria> convocatorias;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "entidad_id_seq")
	@SequenceGenerator(name = "entidad_id_seq", sequenceName = "entidad_id_seq", initialValue = 1, allocationSize = 1)
	@Column(name = "ID", nullable = false, unique = true)
	private Long id;
	
	@Column(name = "FOTO", length = 10485760)
	private String foto;
	
	@Column(name = "NOMBRE", nullable = false, unique = true, length = 1000)
	private String nombre;
	
	@Column(name = "CONTRASENA", nullable = false, length = 20)
	private String contrasena;
	
	@Column(name = "TIPO")
	private String tipo;
	
	@Column(name = "DESCRIPCION", nullable = false, length = 1000)
	private String descripcion;
	
	@Column(name = "TELEFONO", unique = true, length = 20)
	private String telefono;
	
	@Column(name = "DIRECCIONWEB", length = 1000)
	private String direccionWeb;
	
	@Column(name = "CORREO", unique = true, length = 50)
	private String correo;
	
	@Column(name = "FACEBOOK", length = 1000)
	private String facebook;
	
	@Column(name = "LINKEDLN", length = 1000)
	private String linkedln;
	
	@Column(name = "TWITTER", length = 1000)
	private String twitter;
	
	@Column(name = "INSTAGRAM", length = 1000)
	private String instagram;
	
	@Column(name = "DIRECCION", length = 1000)
	private String direccion;
	
	@Column(name = "CIUDAD", length = 1000)
	private String ciudad;
	
	@Column(name = "DEPARTAMENTO", length = 1000)
	private String departamento;

	public Long getId() {
		return id;
	}

	public List<Convocatoria> getConvocatorias() {
		return convocatorias;
	}

	public void setConvocatorias(List<Convocatoria> convocatorias) {
		this.convocatorias = convocatorias;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
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

	public String getTipo() {
		return tipo;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccionWeb() {
		return direccionWeb;
	}

	public void setDireccionWeb(String direccionWeb) {
		this.direccionWeb = direccionWeb;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getLinkedln() {
		return linkedln;
	}

	public void setLinkedln(String linkedln) {
		this.linkedln = linkedln;
	}

	public String getTwitter() {
		return twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	public String getInstagram() {
		return instagram;
	}

	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
}
