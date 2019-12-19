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
@Table(name = "diagnostico_ci")
public class DiagnosticoCI implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "diagnosticoCI_id_seq")
	@SequenceGenerator(name = "diagnosticoCI_id_seq", sequenceName = "diagnosticoCI_id_seq", initialValue = 1, allocationSize = 1)
	private Long id;
	
	@Column(name = "DIV_SECTOR_PERT")
	private int divSectorPert;
	
	@Column(name = "DIO_SECTOR_PERT")
	private String dioSectorPert;
	
	@Column(name = "DIE_SECTOR_PERT")
	private String dieSectorPert;
	
	@Column(name = "DIL_SECTOR_PERT")
	private String dilSectorPert;
	
	@Column(name = "DIV_INDUSTRIA_IMPAC")
	private int divIndustriaImpac;
	
	@Column(name = "DIO_INDUSTRIA_IMPAC")
	private String dioIndustriaImpac;
	
	@Column(name = "DIE_INDUSTRIA_IMPAC")
	private String dieIndustriaImpac;
	
	@Column(name = "DIL_INDUSTRIA_IMPAC")
	private String dilIndustriaImpac;
	
	@Column(name = "DIV_TEND_IND_IMPAC")
	private int divTendIndImpac;
	
	@Column(name = "DIO_TEND_IND_IMPAC")
	private String dioTendIndImpac;
	
	@Column(name = "DIE_TEND_IND_IMPAC")
	private String dieTendIndImpac;
	
	@Column(name = "DIL_TEND_IND_IMPAC")
	private String dilTendIndImpac;
	
	@Column(name = "DIV_TEND_IND_VENT")
	private int divTendIndVent;
	
	@Column(name = "DIO_TEND_IND_VENT")
	private String dioTendIndVent;
	
	@Column(name = "DIE_TEND_IND_VENT")
	private String dieTendIndVent;
	
	@Column(name = "DIL_TEND_IND_VENT")
	private String dilTendIndVent;
	
	@Column(name = "DIV_CONOCE_CREC")
	private int divConoceCrec;
	
	@Column(name = "DIO_CONOCE_CREC")
	private String dioConoceCrec;
	
	@Column(name = "DIE_CONOCE_CREC")
	private String dieConoceCrec;
	
	@Column(name = "DIL_CONOCE_CREC")
	private String dilConoceCrec;
	
	@Column(name = "DIV_PRIORIDAD_IND")
	private int divPrioridadInd;
	
	@Column(name = "DIO_PRIORIDAD_IND")
	private String dioPrioridadInd;
	
	@Column(name = "DIE_PRIORIDAD_IND")
	private String diePrioridadInd;
	
	@Column(name = "DIL_PRIORIDAD_IND")
	private String dilPrioridadInd;
	
	@Column(name = "DIV_TAMANO_MERC")
	private int divTamanoMerc;
	
	@Column(name = "DIO_TAMANO_MERC")
	private String dioTamanoMerc;
	
	@Column(name = "DIE_TAMANO_MERC")
	private String dieTamanoMerc;
	
	@Column(name = "DIL_TAMANO_MERC")
	private String dilTamanoMerc;
	
	@Column(name = "DIV_ACTORES_INV")
	private int divActoresInv;
	
	@Column(name = "DIO_ACTORES_INV")
	private String dioActoresInv;
	
	@Column(name = "DIE_ACTORES_INV")
	private String dieActoresInv;
	
	@Column(name = "DIL_ACTORES_INV")
	private String dilActoresInv;
	
	@Column(name = "DIV_RESPONSABILIDAD_ACTOR")
	private int divResponsabilidadActor;
	
	@Column(name = "DIO_RESPONSABILIDAD_ACTOR")
	private String dioResponsabilidadActor;
	
	@Column(name = "DIE_RESPONSABILIDAD_ACTOR")
	private String dieResponsabilidadActor;
	
	@Column(name = "DIL_RESPONSABILIDAD_ACTOR")
	private String dilResponsabilidadActor;
	
	@Column(name = "DIV_INVOLUCRADOS_REL")
	private int divInvolucradosRel;
	
	@Column(name = "DIO_INVOLUCRADOS_REL")
	private String dioInvolucradosRel;
	
	@Column(name = "DIE_INVOLUCRADOS_REL")
	private String dieInvolucradosRel;
	
	@Column(name = "DIL_INVOLUCRADOS_REL")
	private String dilInvolucradosRel;
	
	@Column(name = "DIV_CLARIDAD_CAD")
	private int divClaridadCad;
	
	@Column(name = "DIO_CLARIDAD_CAD")
	private String dioClaridadCad;
	
	@Column(name = "DIE_CLARIDAD_CAD")
	private String dieClaridadCad;
	
	@Column(name = "DIL_CLARIDAD_CAD")
	private String dilClaridadCad;
	
	@Column(name = "DIV_IDENTIFICA_CAD")
	private int divIdentificaCad;
	
	@Column(name = "DIO_IDENTIFICA_CAD")
	private String dioIdentificaCad;
	
	@Column(name = "DIE_IDENTIFICA_CAD")
	private String dieIdentificaCad;
	
	@Column(name = "DIL_IDENTIFICA_CAD")
	private String dilIdentificaCad;
	
	@Column(name = "DIV_INVOLUCRADOS_CORE")
	private int divInvolucradosCore;
	
	@Column(name = "DIO_INVOLUCRADOS_CORE")
	private String dioInvolucradosCore;
	
	@Column(name = "DIE_INVOLUCRADOS_CORE")
	private String dieInvolucradosCore;
	
	@Column(name = "DIL_INVOLUCRADOS_CORE")
	private String dilInvolucradosCore;
	
	@Column(name = "DIV_RETOS")
	private int divRetos;
	
	@Column(name = "DIO_RETOS")
	private String dioRetos;
	
	@Column(name = "DIE_RETOS")
	private String dieRetos;
	
	@Column(name = "DIL_RETOS")
	private String dilRetos;
	
	@Column(name = "DIV_RETOS_IMPAC")
	private int divRetosImpac;
	
	@Column(name = "DIO_RETOS_IMPAC")
	private String dioRetosImpac;
	
	@Column(name = "DIE_RETOS_IMPAC")
	private String dieRetosImpac;
	
	@Column(name = "DIL_RETOS_IMPAC")
	private String dilRetosImpac;
	
	@Column(name = "DIV_RETOS_ALTE")
	private int divRetosAlte;
	
	@Column(name = "DIO_RETOS_ALTE")
	private String dioRetosAlte;
	
	@Column(name = "DIE_RETOS_ALTE")
	private String dieRetosAlte;
	
	@Column(name = "DIL_RETOS_ALTE")
	private String dilRetosAlte;
	
	@Column(name = "DIV_CAMBIOS_DEMO")
	private int divCambiosDemo;
	
	@Column(name = "DIO_CAMBIOS_DEMO")
	private String dioCambiosDemo;
	
	@Column(name = "DIE_CAMBIOS_DEMO")
	private String dieCambiosDemo;
	
	@Column(name = "DIL_CAMBIOS_DEMO")
	private String dilCambiosDemo;
	
	@Column(name = "DIV_CAMBIOS_DEMO_IMPAC")
	private int divCambiosDemoImpac;
	
	@Column(name = "DIO_CAMBIOS_DEMO_IMPAC")
	private String dioCambiosDemoImpac;
	
	@Column(name = "DIE_CAMBIOS_DEMO_IMPAC")
	private String dieCambiosDemoImpac;
	
	@Column(name = "DIL_CAMBIOS_DEMO_IMPAC")
	private String dilCambiosDemoImpac;
	
	@Column(name = "DIV_CAMBIOS_PSICO")
	private int divCambiosPsico;
	
	@Column(name = "DIO_CAMBIOS_PSICO")
	private String dioCambiosPsico;
	
	@Column(name = "DIE_CAMBIOS_PSICO")
	private String dieCambiosPsico;
	
	@Column(name = "DIL_CAMBIOS_PSICO")
	private String dilCambiosPsico;
	
	@Column(name = "DIV_CAMBIOS_PSICO_IMPAC")
	private int divCambiosPsicoImpac;
	
	@Column(name = "DIO_CAMBIOS_PSICO_IMPAC")
	private String dioCambiosPsicoImpac;
	
	@Column(name = "DIE_CAMBIOS_PSICO_IMPAC")
	private String dieCambiosPsicoImpac;
	
	@Column(name = "DIL_CAMBIOS_PSICO_IMPAC")
	private String dilCambiosPsicoImpac;
	
	@Column(name = "DIV_TIC_IMPAC")
	private int divTicImpac;
	
	@Column(name = "DIO_TIC_IMPAC")
	private String dioTicImpac;
	
	@Column(name = "DIE_TIC_IMPAC")
	private String dieTicImpac;
	
	@Column(name = "DIL_TIC_IMPAC")
	private String dilTicImpac;
	
	@Column(name = "DIV_BENEFICIOS_TEC")
	private int divBeneficiosTec;
	
	@Column(name = "DIO_BENEFICIOS_TEC")
	private String dioBeneficiosTec;
	
	@Column(name = "DIE_BENEFICIOS_TEC")
	private String dieBeneficiosTec;
	
	@Column(name = "DIL_BENEFICIOS_TEC")
	private String dilBeneficiosTec;
	
	@Column(name = "DIV_CONDICIONES_POL")
	private int divCondicionesPol;
	
	@Column(name = "DIO_CONDICIONES_POL")
	private String dioCondicionesPol;
	
	@Column(name = "DIE_CONDICIONES_POL")
	private String dieCondicionesPol;
	
	@Column(name = "DIL_CONDICIONES_POL")
	private String dilCondicionesPol;

	@Column(name = "DIV_CONDICIONES_POL_IMPAC")
	private int divCondicionesPolImpac;
	
	@Column(name = "DIO_CONDICIONES_POL_IMPAC")
	private String dioCondicionesPolImpac;
	
	@Column(name = "DIE_CONDICIONES_POL_IMPAC")
	private String dieCondicionesPolImpac;
	
	@Column(name = "DIL_CONDICIONES_POL_IMPAC")
	private String dilCondicionesPolImpac;
	
	@Column(name = "DIV_IMPAC_SOCIAL")
	private int divImpacSocial;
	
	@Column(name = "DIO_IMPAC_SOCIAL")
	private String dioImpacSocial;
	
	@Column(name = "DIE_IMPAC_SOCIAL")
	private String dieImpacSocial;
	
	@Column(name = "DIL_IMPAC_SOCIAL")
	private String dilImpacSocial;
	
	@Column(name = "DIV_VERT_MERC")
	private int divVertMerc;
	
	@Column(name = "DIO_VERT_MERC")
	private String dioVertMerc;
	
	@Column(name = "DIE_VERT_MERC")
	private String dieVertMerc;
	
	@Column(name = "DIL_VERT_MERC")
	private String dilVertMerc;
	
	@Column(name = "IFDV_COMPETIDORES")
	private int ifdvCompetidores;
	
	@Column(name = "IFDO_COMPETIDORES")
	private String ifdoCompetidores;
	
	@Column(name = "IFDE_COMPETIDORES")
	private String ifdeCompetidores;
	
	@Column(name = "IFDL_COMPETIDORES")
	private String ifdlCompetidores;
	
	@Column(name = "IFDV_COMPETIDORES_VALOR")
	private int ifdvCompetidoresValor;
	
	@Column(name = "IFDO_COMPETIDORES_VALOR")
	private String ifdoCompetidoresValor;
	
	@Column(name = "IFDE_COMPETIDORES_VALOR")
	private String ifdeCompetidoresValor;
	
	@Column(name = "IFDL_COMPETIDORES_VALOR")
	private String ifdlCompetidoresValor;
	
	@Column(name = "IFDV_COMPETIDORES_COND")
	private int ifdvCompetidoresCond;
	
	@Column(name = "IFDO_COMPETIDORES_COND")
	private String ifdoCompetidoresCond;
	
	@Column(name = "IFDE_COMPETIDORES_COND")
	private String ifdeCompetidoresCond;
	
	@Column(name = "IFDL_COMPETIDORES_COND")
	private String ifdlCompetidoresCond;
	
	@Column(name = "IFDV_COMPETIDORES_BENE")
	private int ifdvCompetidoresBene;
	
	@Column(name = "IFDO_COMPETIDORES_BENE")
	private String ifdoCompetidoresBene;
	
	@Column(name = "IFDE_COMPETIDORES_BENE")
	private String ifdeCompetidoresBene;
	
	@Column(name = "IFDL_COMPETIDORES_BENE")
	private String ifdlCompetidoresBene;
	
	@Column(name = "IFDV_COMPETIDORES_INV")
	private int ifdvCompetidoresInv;
	
	@Column(name = "IFDO_COMPETIDORES_INV")
	private String ifdoCompetidoresInv;
	
	@Column(name = "IFDE_COMPETIDORES_INV")
	private String ifdeCompetidoresInv;
	
	@Column(name = "IFDL_COMPETIDORES_INV")
	private String ifdlCompetidoresInv;
	
	@Column(name = "IFDV_COMPETIDORES_GAPS")
	private int ifdvCompetidoresGaps;
	
	@Column(name = "IFDO_COMPETIDORES_GAPS")
	private String ifdoCompetidoresGaps;
	
	@Column(name = "IFDE_COMPETIDORES_GAPS")
	private String ifdeCompetidoresGaps;
	
	@Column(name = "IFDL_COMPETIDORES_GAPS")
	private String ifdlCompetidoresGaps;
	
	@Column(name = "IFDV_COMPETIDORES_VENT")
	private int ifdvCompetidoresVent;
	
	@Column(name = "IFDO_COMPETIDORES_VENT")
	private String ifdoCompetidoresVent;
	
	@Column(name = "IFDE_COMPETIDORES_VENT")
	private String ifdeCompetidoresVent;
	
	@Column(name = "IFDL_COMPETIDORES_VENT")
	private String ifdlCompetidoresVent;
	
	@Column(name = "IFDV_COMPETIDORES_RECI")
	private int ifdvCompetidoresReci;
	
	@Column(name = "IFDO_COMPETIDORES_RECI")
	private String ifdoCompetidoresReci;
	
	@Column(name = "IFDE_COMPETIDORES_RECI")
	private String ifdeCompetidoresReci;
	
	@Column(name = "IFDL_COMPETIDORES_RECI")
	private String ifdlCompetidoresReci;
	
}