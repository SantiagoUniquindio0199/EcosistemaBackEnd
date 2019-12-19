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
@Table(name = "startups")
public class Startup implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@OneToMany(mappedBy = "startupApli", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Convocatoria_Startup> convocatorias;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "startupProd", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Producto> productos;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "startup_id_seq")
	@SequenceGenerator(name = "startup_id_seq", sequenceName = "startup_id_seq", initialValue = 1, allocationSize = 1)
	@Column(name = "ID", unique = true, nullable = false)
	private Long id;
	
	@Column(name = "NOMBRE", nullable = false, length = 1000)
	private String nombre;
	
	@Column(name = "CONTRASENA", nullable = false, length = 20)
	private String contrasena;
	
	@Column(name = "SECTOR", nullable = false)
	private String sector;
	
	@Column(name = "INTENSION", nullable = false, length = 1000)
	private String intension;
	
	@Column(name = "NOMINA")
	private String nomina;
	
	@Column(name = "PRESTACION")
	private String prestacion;
	
	@Column(name = "PUNTOEQUILIBRIO")
	private String puntoEquilibrio;
	
	@Column(name = "ESTRATEGIA", length = 1000)
	private String estrategia;
	
	@Column(name = "TIEMPOMETA", length = 1000)
	private String tiempoMeta;
	
	@Column(name = "PERSONACONTACTO", length = 1000)
	private String personaContacto;
	
	@Column(name = "CORREOCONTACTO", length = 50)
	private String correoContacto;
	
	@Column(name = "TELEFONOCONTACTO", length = 20)
	private String telefonoContacto;
	
	@Column(name = "PERFILIDENTIFICADOR")
	private String perfilIdentificador;
	
	@Column(name = "NOMBREENCARGADO", length = 1000)
	private String nombreEncargado;
	
	@Column(name = "CORREOENCARGADO", length = 50)
	private String correoEncargado;
	
	@Column(name = "TELEFONOENCARGADO", length = 20)
	private String telefonoEncargado;
	
	//Atributos infoNegocio
	
	@Column(name = "SEGMENTOCLI", length = 1000)
	private String segmentoCli;
	
	@Column(name = "PROPUESTACLI", length = 1000)
	private String propuestaCli;
	
	@Column(name = "CANALESINFOCLI", length = 1000)
	private String canalesInfoCli;
	
	@Column(name = "CANALESEVACLI", length = 1000)
	private String canalesEvaCli;
	
	@Column(name = "CANALESVENTACLI", length = 1000)
	private String canalesVentaCli;
	
	@Column(name = "CANALESENTREGACLI", length = 1000)
	private String canalesEntregaCli;
	
	@Column(name = "CANALESPOSVENTACLI", length = 1000)
	private String canalesPosVentaCli;
	
	@Column(name = "SEGMENTOUSU", length = 1000)
	private String segmentoUsu;
	
	@Column(name = "PROPUESTAUSU", length = 1000)
	private String propuestaUsu;
	
	@Column(name = "CANALESINFOUSU", length = 1000)
	private String canalesInfoUsu;
	
	@Column(name = "CANALESEVAUSU", length = 1000)
	private String canalesEvaUsu;
	
	@Column(name = "CANALESVENTAUSU", length = 1000)
	private String canalesVentaUsu;
	
	@Column(name = "CANALESENTREGAUSU", length = 1000)
	private String canalesEntregaUsu;
	
	@Column(name = "CANALESPOSVENTAUSU", length = 1000)
	private String canalesPosVentaUsu;
	
	@Column(name = "PERSONALCLI")
	private String personalCli;
	
	@Column(name = "PERSONALDEDICADOCLI")
	private String personalDedicadoCli;
	
	@Column(name = "AUTOSERVICIOCLI")
	private String autoservicioCli;
	
	@Column(name = "AUTOMATIZADOCLI")
	private String automatizadoCli;
	
	@Column(name = "COMUNIDADESCLI")
	private String comunidadesCli;
	
	@Column(name = "PERSONALUSU")
	private String personalUsu;
	
	@Column(name = "PERSONALDEDICADOUSU")
	private String personalDedicadoUsu;
	
	@Column(name = "AUTOSERVICIOUSU")
	private String autoservicioUsu;
	
	@Column(name = "AUTOMATIZADOUSU")
	private String automatizadoUsu;
	
	@Column(name = "COMUNIDADESUSU")
	private String comunidadesUsu;
	
	@Column(name = "NOMBREPROCESO", length = 1000)
	private String nombreProceso;
	
	@Column(name = "PERSPECTIVAUSUARIO", length = 1000)
	private String perspectivaUsuario;
	
	@Column(name = "PERSPECTIVAEMPRESA", length = 1000)
	private String perspectivaEmpresa;
	
	@Column(name = "OBJETIVOPROCESO", length = 1000)
	private String objetivoProceso;
	
	@Column(name = "DESCRIPCIONPROCESO", length = 1000)
	private String descripcionProceso;
	
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

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public List<Convocatoria_Startup> getConvocatorias() {
		return convocatorias;
	}

	public void setConvocatorias(List<Convocatoria_Startup> convocatorias) {
		this.convocatorias = convocatorias;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getIntension() {
		return intension;
	}

	public void setIntension(String intension) {
		this.intension = intension;
	}

	public String getNomina() {
		return nomina;
	}

	public void setNomina(String nomina) {
		this.nomina = nomina;
	}

	public String getPrestacion() {
		return prestacion;
	}

	public void setPrestacion(String prestacion) {
		this.prestacion = prestacion;
	}

	public String getPuntoEquilibrio() {
		return puntoEquilibrio;
	}

	public void setPuntoEquilibrio(String puntoEquilibrio) {
		this.puntoEquilibrio = puntoEquilibrio;
	}

	public String getEstrategia() {
		return estrategia;
	}

	public void setEstrategia(String estrategia) {
		this.estrategia = estrategia;
	}

	public String getTiempoMeta() {
		return tiempoMeta;
	}

	public void setTiempoMeta(String tiempoMeta) {
		this.tiempoMeta = tiempoMeta;
	}

	public String getPersonaContacto() {
		return personaContacto;
	}

	public void setPersonaContacto(String personaContacto) {
		this.personaContacto = personaContacto;
	}

	public String getCorreoContacto() {
		return correoContacto;
	}

	public void setCorreoContacto(String correoContacto) {
		this.correoContacto = correoContacto;
	}

	public String getTelefonoContacto() {
		return telefonoContacto;
	}

	public void setTelefonoContacto(String telefonoContacto) {
		this.telefonoContacto = telefonoContacto;
	}

	public String getPerfilIdentificador() {
		return perfilIdentificador;
	}

	public void setPerfilIdentificador(String perfilIdentificador) {
		this.perfilIdentificador = perfilIdentificador;
	}

	public String getNombreEncargado() {
		return nombreEncargado;
	}

	public void setNombreEncargado(String nombreEncargado) {
		this.nombreEncargado = nombreEncargado;
	}

	public String getCorreoEncargado() {
		return correoEncargado;
	}

	public void setCorreoEncargado(String correoEncargado) {
		this.correoEncargado = correoEncargado;
	}

	public String getTelefonoEncargado() {
		return telefonoEncargado;
	}

	public void setTelefonoEncargado(String telefonoEncargado) {
		this.telefonoEncargado = telefonoEncargado;
	}

	public String getSegmentoCli() {
		return segmentoCli;
	}

	public void setSegmentoCli(String segmentoCli) {
		this.segmentoCli = segmentoCli;
	}

	public String getPropuestaCli() {
		return propuestaCli;
	}

	public void setPropuestaCli(String propuestaCli) {
		this.propuestaCli = propuestaCli;
	}

	public String getCanalesInfoCli() {
		return canalesInfoCli;
	}

	public void setCanalesInfoCli(String canalesInfoCli) {
		this.canalesInfoCli = canalesInfoCli;
	}

	public String getCanalesEvaCli() {
		return canalesEvaCli;
	}

	public void setCanalesEvaCli(String canalesEvaCli) {
		this.canalesEvaCli = canalesEvaCli;
	}

	public String getCanalesVentaCli() {
		return canalesVentaCli;
	}

	public void setCanalesVentaCli(String canalesVentaCli) {
		this.canalesVentaCli = canalesVentaCli;
	}

	public String getCanalesEntregaCli() {
		return canalesEntregaCli;
	}

	public void setCanalesEntregaCli(String canalesEntregaCli) {
		this.canalesEntregaCli = canalesEntregaCli;
	}

	public String getCanalesPosVentaCli() {
		return canalesPosVentaCli;
	}

	public void setCanalesPosVentaCli(String canalesPosVentaCli) {
		this.canalesPosVentaCli = canalesPosVentaCli;
	}

	public String getSegmentoUsu() {
		return segmentoUsu;
	}

	public void setSegmentoUsu(String segmentoUsu) {
		this.segmentoUsu = segmentoUsu;
	}

	public String getPropuestaUsu() {
		return propuestaUsu;
	}

	public void setPropuestaUsu(String propuestaUsu) {
		this.propuestaUsu = propuestaUsu;
	}

	public String getCanalesInfoUsu() {
		return canalesInfoUsu;
	}

	public void setCanalesInfoUsu(String canalesInfoUsu) {
		this.canalesInfoUsu = canalesInfoUsu;
	}

	public String getCanalesEvaUsu() {
		return canalesEvaUsu;
	}

	public void setCanalesEvaUsu(String canalesEvaUsu) {
		this.canalesEvaUsu = canalesEvaUsu;
	}

	public String getCanalesVentaUsu() {
		return canalesVentaUsu;
	}

	public void setCanalesVentaUsu(String canalesVentaUsu) {
		this.canalesVentaUsu = canalesVentaUsu;
	}

	public String getCanalesEntregaUsu() {
		return canalesEntregaUsu;
	}

	public void setCanalesEntregaUsu(String canalesEntregaUsu) {
		this.canalesEntregaUsu = canalesEntregaUsu;
	}

	public String getCanalesPosVentaUsu() {
		return canalesPosVentaUsu;
	}

	public void setCanalesPosVentaUsu(String canalesPosVentaUsu) {
		this.canalesPosVentaUsu = canalesPosVentaUsu;
	}

	public String getPersonalCli() {
		return personalCli;
	}

	public void setPersonalCli(String personalCli) {
		this.personalCli = personalCli;
	}

	public String getPersonalDedicadoCli() {
		return personalDedicadoCli;
	}

	public void setPersonalDedicadoCli(String personalDedicadoCli) {
		this.personalDedicadoCli = personalDedicadoCli;
	}

	public String getAutoservicioCli() {
		return autoservicioCli;
	}

	public void setAutoservicioCli(String autoservicioCli) {
		this.autoservicioCli = autoservicioCli;
	}

	public String getAutomatizadoCli() {
		return automatizadoCli;
	}

	public void setAutomatizadoCli(String automatizadoCli) {
		this.automatizadoCli = automatizadoCli;
	}

	public String getComunidadesCli() {
		return comunidadesCli;
	}

	public void setComunidadesCli(String comunidadesCli) {
		this.comunidadesCli = comunidadesCli;
	}

	public String getPersonalUsu() {
		return personalUsu;
	}

	public void setPersonalUsu(String personalUsu) {
		this.personalUsu = personalUsu;
	}

	public String getPersonalDedicadoUsu() {
		return personalDedicadoUsu;
	}

	public void setPersonalDedicadoUsu(String personalDedicadoUsu) {
		this.personalDedicadoUsu = personalDedicadoUsu;
	}

	public String getAutoservicioUsu() {
		return autoservicioUsu;
	}

	public void setAutoservicioUsu(String autoservicioUsu) {
		this.autoservicioUsu = autoservicioUsu;
	}

	public String getAutomatizadoUsu() {
		return automatizadoUsu;
	}

	public void setAutomatizadoUsu(String automatizadoUsu) {
		this.automatizadoUsu = automatizadoUsu;
	}

	public String getComunidadesUsu() {
		return comunidadesUsu;
	}

	public void setComunidadesUsu(String comunidadesUsu) {
		this.comunidadesUsu = comunidadesUsu;
	}

	public String getNombreProceso() {
		return nombreProceso;
	}

	public void setNombreProceso(String nombreProceso) {
		this.nombreProceso = nombreProceso;
	}

	public String getPerspectivaUsuario() {
		return perspectivaUsuario;
	}

	public void setPerspectivaUsuario(String perspectivaUsuario) {
		this.perspectivaUsuario = perspectivaUsuario;
	}

	public String getPerspectivaEmpresa() {
		return perspectivaEmpresa;
	}

	public void setPerspectivaEmpresa(String perspectivaEmpresa) {
		this.perspectivaEmpresa = perspectivaEmpresa;
	}

	public String getObjetivoProceso() {
		return objetivoProceso;
	}

	public void setObjetivoProceso(String objetivoProceso) {
		this.objetivoProceso = objetivoProceso;
	}

	public String getDescripcionProceso() {
		return descripcionProceso;
	}

	public void setDescripcionProceso(String descripcionProceso) {
		this.descripcionProceso = descripcionProceso;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}

