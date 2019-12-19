package com.miruss.ecosistema.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "requisitos")
public class Requisitos implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "requisitos")
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JsonIgnore
	private Convocatoria convocatoria_req;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "requisitos_id_seq")
	@SequenceGenerator(name = "requisitos_id_seq", sequenceName = "requisitos_id_seq", allocationSize = 1, initialValue = 1)
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "PRODUCTOS_SERVICIOS")
	private String pro;
	
	@Column(name = "EMPLEADOS_NOMINA")
	private String empNom;
	
	@Column(name = "EMPLEADOS_PRESTACION")
	private String empPre;
	
	@Column(name = "INTENSION")
	private String inten;
	
	@Column(name = "ESTRATEGIA")
	private String est;
	
	@Column(name = "TIEMPO_META")
	private String tieMet;
	
	@Column(name = "PERSONA_CONTACTO")
	private String perCon;
	
	@Column(name = "CORREO_CONTACTO")
	private String corCon;
	
	@Column(name = "TELEFONO_CONTACTO")
	private String telCon;
	
	@Column(name = "NOMBRE_ENCARGADO")
	private String nomEnc;
	
	@Column(name = "CORREO_ENCARGADO")
	private String corEnc;
	
	@Column(name = "TELEFONO_ENCARGADO")
	private String telEnc;
	
	@Column(name = "SEGMENTO_MERCADO_CLI")
	private String segMerCli;
	
	@Column(name = "SEGMENTO_MERCADO_USU")
	private String segMerUsu;
	
	@Column(name = "PROPUESTA_VALOR_CLI")
	private String proValCli;
	
	@Column(name = "PROPUESTA_VALOR_USU")
	private String proValUsu;
	
	@Column(name = "CANALES_INFO_CLI")
	private String canInfCli;
	
	@Column(name = "CANALES_INFO_USU")
	private String canInfUsu;
	
	@Column(name = "CANALES_EVA_CLI")
	private String canEvaCli;
	
	@Column(name = "CANALES_EVA_USU")
	private String canEvaUsu;
	
	@Column(name = "CANALES_VEN_CLI")
	private String canVenCli;
	
	@Column(name = "CANALES_VEN_USU")
	private String canVenUsu;
	
	@Column(name = "CANALES_ENT_CLI")
	private String canEntCli;
	
	@Column(name = "CANALES_ENT_USU")
	private String canEntUsu;
	
	@Column(name = "CANALES_POS_CLI")
	private String canPosCli;
	
	@Column(name = "CANALES_POS_USU")
	private String canPosUsu;
	
	@Column(name = "RELACIONAMIENTO_CLI")
	private String relCli;

	@Column(name = "RELACIONAMIENTO_USU")
	private String relUsu;
	
	@Column(name = "NOMBRE_PROCESO")
	private String nomPro;
	
	@Column(name = "OBJETIVO_PROCESO")
	private String objPro;
	
	@Column(name = "DESCRIPCION_PROCESO")
	private String desPro;
	
	@Column(name = "META_PROCESO_CLI")
	private String metProCli;
	
	@Column(name = "META_PROCESO_USU")
	private String metProUsu;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPro() {
		return pro;
	}

	public void setPro(String pro) {
		this.pro = pro;
	}

	public Convocatoria getConvocatoria_req() {
		return convocatoria_req;
	}

	public void setConvocatoria_req(Convocatoria convocatoria_req) {
		this.convocatoria_req = convocatoria_req;
	}

	public String getEmpNom() {
		return empNom;
	}

	public void setEmpNom(String empNom) {
		this.empNom = empNom;
	}

	public String getEmpPre() {
		return empPre;
	}

	public void setEmpPre(String empPre) {
		this.empPre = empPre;
	}

	public String getInten() {
		return inten;
	}

	public void setInten(String inten) {
		this.inten = inten;
	}

	public String getEst() {
		return est;
	}

	public void setEst(String est) {
		this.est = est;
	}

	public String getTieMet() {
		return tieMet;
	}

	public void setTieMet(String tieMet) {
		this.tieMet = tieMet;
	}

	public String getPerCon() {
		return perCon;
	}

	public void setPerCon(String perCon) {
		this.perCon = perCon;
	}

	public String getCorCon() {
		return corCon;
	}

	public void setCorCon(String corCon) {
		this.corCon = corCon;
	}

	public String getTelCon() {
		return telCon;
	}

	public void setTelCon(String telCon) {
		this.telCon = telCon;
	}

	public String getNomEnc() {
		return nomEnc;
	}

	public void setNomEnc(String nomEnc) {
		this.nomEnc = nomEnc;
	}

	public String getCorEnc() {
		return corEnc;
	}

	public void setCorEnc(String corEnc) {
		this.corEnc = corEnc;
	}

	public String getTelEnc() {
		return telEnc;
	}

	public void setTelEnc(String telEnc) {
		this.telEnc = telEnc;
	}

	public String getSegMerCli() {
		return segMerCli;
	}

	public void setSegMerCli(String segMerCli) {
		this.segMerCli = segMerCli;
	}

	public String getSegMerUsu() {
		return segMerUsu;
	}

	public void setSegMerUsu(String segMerUsu) {
		this.segMerUsu = segMerUsu;
	}

	public String getProValCli() {
		return proValCli;
	}

	public void setProValCli(String proValCli) {
		this.proValCli = proValCli;
	}

	public String getProValUsu() {
		return proValUsu;
	}

	public void setProValUsu(String proValUsu) {
		this.proValUsu = proValUsu;
	}

	public String getCanInfCli() {
		return canInfCli;
	}

	public void setCanInfCli(String canInfCli) {
		this.canInfCli = canInfCli;
	}

	public String getCanInfUsu() {
		return canInfUsu;
	}

	public void setCanInfUsu(String canInfUsu) {
		this.canInfUsu = canInfUsu;
	}

	public String getCanEvaCli() {
		return canEvaCli;
	}

	public void setCanEvaCli(String canEvaCli) {
		this.canEvaCli = canEvaCli;
	}

	public String getCanEvaUsu() {
		return canEvaUsu;
	}

	public void setCanEvaUsu(String canEvaUsu) {
		this.canEvaUsu = canEvaUsu;
	}

	public String getCanVenCli() {
		return canVenCli;
	}

	public void setCanVenCli(String canVenCli) {
		this.canVenCli = canVenCli;
	}

	public String getCanVenUsu() {
		return canVenUsu;
	}

	public void setCanVenUsu(String canVenUsu) {
		this.canVenUsu = canVenUsu;
	}

	public String getCanEntCli() {
		return canEntCli;
	}

	public void setCanEntCli(String canEntCli) {
		this.canEntCli = canEntCli;
	}

	public String getCanEntUsu() {
		return canEntUsu;
	}

	public void setCanEntUsu(String canEntUsu) {
		this.canEntUsu = canEntUsu;
	}

	public String getCanPosCli() {
		return canPosCli;
	}

	public void setCanPosCli(String canPosCli) {
		this.canPosCli = canPosCli;
	}

	public String getCanPosUsu() {
		return canPosUsu;
	}

	public void setCanPosUsu(String canPosUsu) {
		this.canPosUsu = canPosUsu;
	}

	public String getRelCli() {
		return relCli;
	}

	public void setRelCli(String relCli) {
		this.relCli = relCli;
	}

	public String getRelUsu() {
		return relUsu;
	}

	public void setRelUsu(String relUsu) {
		this.relUsu = relUsu;
	}

	public String getNomPro() {
		return nomPro;
	}

	public void setNomPro(String nomPro) {
		this.nomPro = nomPro;
	}

	public String getObjPro() {
		return objPro;
	}

	public void setObjPro(String objPro) {
		this.objPro = objPro;
	}

	public String getDesPro() {
		return desPro;
	}

	public void setDesPro(String desPro) {
		this.desPro = desPro;
	}

	public String getMetProCli() {
		return metProCli;
	}

	public void setMetProCli(String metProCli) {
		this.metProCli = metProCli;
	}

	public String getMetProUsu() {
		return metProUsu;
	}

	public void setMetProUsu(String metProUsu) {
		this.metProUsu = metProUsu;
	}
	
}
