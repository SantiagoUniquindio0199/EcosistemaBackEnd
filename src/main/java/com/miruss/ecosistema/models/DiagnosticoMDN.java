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
@Table(name = "diagnostico_mdn")
public class DiagnosticoMDN implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "diacnosticoMDN_id_seq")
	@SequenceGenerator(name = "diacnosticoMDN_id_seq", sequenceName = "diacnosticoMDN_id_seq", allocationSize = 1, initialValue = 1)
	private Long id;
	
	@Column(name = "PVV_CONSONANCIA")
	private int pvvConsocnacia;

	@Column(name = "PVO_CONSONANCIA")
	private String pvoConsocnacia;
	
	@Column(name = "PVE_CONSONANCIA")
	private String pveConsocnacia;
	
	@Column(name = "PVL_CONSONANCIA")
	private String pvlConsocnacia;
	
	@Column(name = "PVV_RED")
	private int pvvRed;
	
	@Column(name = "PVO_RED")
	private String pvoRed;
	
	@Column(name = "PVE_RED")
	private String pveRed;
	
	@Column(name = "PVL_RED")
	private String pvlRed;
	
	@Column(name = "PVV_SINERGIA")
	private int pvvSinergia;
	
	@Column(name = "PVO_SINERGIA")
	private String pvoSinergia;
	
	@Column(name = "PVE_SINERGIA")
	private String pveSinergia;
	
	@Column(name = "PVL_SINERGIA")
	private String pvlSinergia;
	
	@Column(name = "PVV_CLIENTES")
	private int pvvClientes;
	
	@Column(name = "PVO_CIENTES")
	private String pvoClientes;
	
	@Column(name = "PVE_CLIENTES")
	private String pveClientes;
	
	@Column(name = "PVL_CLIENTES")
	private String pvlClientes;
	
	@Column(name = "CIV_INGRESOS")
	private int civIngresos;
	
	@Column(name = "CIO_INGRESOS")
	private String cioIngresos;
	
	@Column(name = "CIE_INGRESOS")
	private String cieIngresos;
	
	@Column(name = "CIL_INGRESOS")
	private String cilIngresos;
	
	@Column(name = "CIV_INGRESOS_PRE")
	private int civIngresosPre;
	
	@Column(name = "CIO_INGRESOS_PRE")
	private String cioIngresosPre;
	
	@Column(name = "CIE_INGRESOS_PRE")
	private String cieIngresosPre;
	
	@Column(name = "CIL_INGRESOS_PRE")
	private String cilIngresosPre;
	
	@Column(name = "CIV_INGRESOS_REC")
	private int civIngresosRec;
	
	@Column(name = "CIO_INGRESOS_REC")
	private String cioIngresosRec;
	
	@Column(name = "CIE_INGRESOS_REC")
	private String cieIngresosRec;
	
	@Column(name = "CIL_INGRESOS_REC")
	private String cilIngresosRec;
	
	@Column(name = "CIV_INGRESOS_DIV")
	private int civIngresosDiv;
	
	@Column(name = "CIO_INGRESOS_DIV")
	private String cioIngresosDiv;
	
	@Column(name = "CIE_INGRESOS_DIV")
	private String cieIngresosDiv;
	
	@Column(name = "CIL_INGRESOS_DIV")
	private String cilIngresosDiv;
	
	@Column(name = "CIV_INGRESOS_SOS")
	private int civIngresosSos;
	
	@Column(name = "CIO_INGRESOS_SOS")
	private String cioIngresosSos;
	
	@Column(name = "CIE_INGRESOS_SOS")
	private String cieIngresosSos;
	
	@Column(name = "CIL_INGRESOS_SOS")
	private String cilIngresosSos;
	
	@Column(name = "CIV_INGRESOS_INC")
	private int civIngresosInc;
	
	@Column(name = "CIO_INGRESOS_INC")
	private String cioIngresosInc;
	
	@Column(name = "CIE_INGRESOS_INC")
	private String cieIngresosInc;
	
	@Column(name = "CIL_INGRESOS_INC")
	private String cilIngresosInc;
	
	@Column(name = "CIV_COBRAR_CLI")
	private int civCobrarCli;
	
	@Column(name = "CIO_COBRAR_CLI")
	private String cioCobrarCli;
	
	@Column(name = "CIE_COBRAR_CLI")
	private String cieCobrarCli;
	
	@Column(name = "CIL_COBRAR_CLI")
	private String cilCobrarCli;
	
	@Column(name = "CIV_COSTOS_PRE")
	private int civCostosPre;
	
	@Column(name = "CIO_COSTOS_PRE")
	private String cioCostosPre;
	
	@Column(name = "CIE_COSTOS_PRE")
	private String cieCostosPre;
	
	@Column(name = "CIL_COSTOS_PRE")
	private String cilCostosPre;
	
	@Column(name = "CIV_COSTOS_ADECUADOS")
	private int civCostosAdecuados;
	
	@Column(name = "CIO_COSTOS_ADECUADOS")
	private String cioCostosAdecuados;
	
	@Column(name = "CIE_COSTOS_ADECUADOS")
	private String cieCostosAdecuados;
	
	@Column(name = "CIL_COSTOS_ADECUADOS")
	private String cilCostosAdecuados;
	
	@Column(name = "CIV_OPERACIONES_REN")
	private int civOperacionesRen;
	
	@Column(name = "CIO_OPERACIONES_REN")
	private String cioOperacionesRen;
	
	@Column(name = "CIE_OPERACIONES_REN")
	private String cieOperacionesRen;
	
	@Column(name = "CIL_OPERACIONES_REN")
	private String cilOperacionesRen;
	
	@Column(name = "CIV_ECONOMIAS_ESC")
	private int civEconomiasEsc;
	
	@Column(name = "CIO_ECONOMIAS_ESC")
	private String cioEconomiasEsc;
	
	@Column(name = "CIE_ECONOMIAS_ESC")
	private String cieEconomiasEsc;
	
	@Column(name = "CIL_ECONOMIAS_ESC")
	private String cilEconomiasEsc;
	
	@Column(name = "IV_IMITAR_REC")
	private int ivImitarRec;

	@Column(name = "IO_IMITAR_REC")
	private String ioImitarRec;
	
	@Column(name = "IE_IMITAR_REC")
	private String ieImitarRec;
	
	@Column(name = "IL_IMITAR_REC")
	private String ilImitarRec;

	@Column(name = "IV_NECESIDADES_REC")
	private int ivNecesidadesRec;
	
	@Column(name = "IO_NECESIDADES_REC")
	private String ioNecesidadesRec;
	
	@Column(name = "IE_NECESIDADES_REC")
	private String ieNecesidadesRec;
	
	@Column(name = "IL_NECESIDADES_REC")
	private String ilNecesidadesRec;
	
	@Column(name = "IV_RECURSOS_CLAVE")
	private int ivRecursosClave;
	
	@Column(name = "IO_RECURSOS_CLAVE")
	private String ioRecursosClave;
	
	@Column(name = "IE_RECURSOS_CLAVE")
	private String ieRecursosClave;
	
	@Column(name = "IL_RECURSOS_CLAVE")
	private String ilRecursosClave;
	
	@Column(name = "IV_ACTIVIDADES_CLAVE")
	private int ivActividadesClave;
	
	@Column(name = "IO_ACTIVIDADES_CLAVE")
	private String ioActividadesClave;
	
	@Column(name = "IE_ACTIVIDADES_CLAVE")
	private String ieActividadesClave;
	
	@Column(name = "IL_ACTIVIDADES_CLAVE")
	private String ilActividadesClave;
	
	@Column(name = "IV_ACTIVIDADES_CLAVE_DIF")
	private int ivActividadesClaveDif;
	
	@Column(name = "IO_ACTIVIDADES_CLAVE_DIF")
	private String ioActividadesClaveDif;
	
	@Column(name = "IE_ACTIVIDADES_CLAVE_DIF")
	private String ieActividadesClaveDif;
	
	@Column(name = "IL_ACTIVIDADES_CLAVE_DIF")
	private String ilActividadesClaveDif;
	
	@Column(name = "IV_EJECUCION_CAL")
	private int ivEjecucionCal;
	
	@Column(name = "IO_EJECUCION_CAL")
	private String ioEjecucionCal;
	
	@Column(name = "IE_EJECUCION_CAL")
	private String ieEjecucionCal;
	
	@Column(name = "IL_EJECUCION_CAL")
	private String ilEjecucionCal;
	
	@Column(name = "IV_EQUILIBRIO")
	private int ivEquilibrio;
	
	@Column(name = "IO_EQUILIBRIO")
	private String ioEquilibrio;
	
	@Column(name = "IE_EQUILIBRIO")
	private String ieEquilibrio;
	
	@Column(name = "IL_EQUILIBRIO")
	private String ilEquilibrio;
	
	@Column(name = "IV_ESPECIFICADOS")
	private int ivEspecificados;
	
	@Column(name = "IO_ESPECIFICADOS")
	private String ioEspecificados;
	
	@Column(name = "IE_ESPECIFICADOS")
	private String ieEspecificados;
	
	@Column(name = "IL_ESPECIFICADOS")
	private String ilEspecificados;
	
	@Column(name = "IV_RELACIONES_PRO")
	private int ivRelacionesPro;
	
	@Column(name = "IO_RELACIONES_PRO")
	private String ioRelacionesPro;
	
	@Column(name = "IE_RELACIONES_PRO")
	private String ieRelacionesPro;
	
	@Column(name = "IL_RELACIONES_PRO")
	private String ilRelacionesPro;
	
	@Column(name = "IMV_INDICE")
	private int imvIndice;
	
	@Column(name = "IMO_INDICE")
	private String imoIndice;
	
	@Column(name = "IME_INDICE")
	private String imeIndice;
	
	@Column(name = "IML_INDICE")
	private String imlIndice;
	
	@Column(name = "IMV_CARTERA")
	private int imvCartera;
	
	@Column(name = "IMO_CARTERA")
	private String imoCartera;
	
	@Column(name = "IME_CARTERA")
	private String imeCartera;
	
	@Column(name = "IML_CARTERA")
	private String imlCartera;
	
	@Column(name = "IMV_CAPTAR")
	private int imvCaptar;
	
	@Column(name = "IMO_CAPTAR")
	private String imoCaptar;
	
	@Column(name = "IME_CAPTAR")
	private String imeCaptar;
	
	@Column(name = "IML_CAPTAR")
	private String imlCaptar;
	
	@Column(name = "IMV_CANALES")
	private int imvCanales;
	
	@Column(name = "IMO_CANALES")
	private String imoCanales;
	
	@Column(name = "IME_CANALES")
	private String imeCanales;
	
	@Column(name = "IML_CANALES")
	private String imlCanales;
	
	@Column(name = "IMV_CANALES_EFI")
	private int imvCanalesEfi;
	
	@Column(name = "IMO_CANALES_EFI")
	private String imoCanalesEfi;
	
	@Column(name = "IME_CANALES_EFI")
	private String imeCanalesEfi;
	
	@Column(name = "IML_CANALES_EFI")
	private String imlCanalesEfi;
	
	@Column(name = "IMV_CANALES_CLI")
	private int imvCanalesCli;
	
	@Column(name = "IMO_CANALES_CLI")
	private String imoCanalesCli;
	
	@Column(name = "IME_CANALES_CLI")
	private String imeCanalesCli;
	
	@Column(name = "IML_CANALES_CLI")
	private String imlCanalesCli;
	
	@Column(name = "IMV_CLIENTES_ACCESO")
	private int imvClientesAcceso;
	
	@Column(name = "IMO_CLIENTES_ACCESO")
	private String imoClientesAcceso;
	
	@Column(name = "IME_CLIENTES_ACCESO")
	private String imeClientesAcceso;
	
	@Column(name = "IML_CLIENTES_ACCESO")
	private String imlClientesAcceso;
	
	@Column(name = "IMV_CANALES_INTE")
	private int imvCanalesInte;
	
	@Column(name = "IMO_CANALES_INTE")
	private String imoCanalesInte;
	
	@Column(name = "IME_CANALES_INTE")
	private String imeCanalesInte;
	
	@Column(name = "IML_CANALES_INTE")
	private String imlCanalesInte;
	
	@Column(name = "IMV_CANALES_PROP")
	private int imvCanalesProp;
	
	@Column(name = "IMO_CANALES_PROP")
	private String imoCanalesProp;
	
	@Column(name = "IME_CANALES_PROP")
	private String imeCanalesProp;
	
	@Column(name = "IML_CANALES_PROP")
	private String imlCanalesProp;
	
	@Column(name = "IMV_CANALES_ADE")
	private int imvCanalesAde;
	
	@Column(name = "IMO_CANALES_ADE")
	private String imoCanalesAde;
	
	@Column(name = "IME_CANALES_ADE")
	private String imeCanalesAde;
	
	@Column(name = "IML_CANALES_ADE")
	private String imlCanalesAde;
	
	@Column(name = "IMV_RELACION_CLI")
	private int imvRelacionCli;
	
	@Column(name = "IMO_RELACION_CLI")
	private String imoRelacionCli;
	
	@Column(name = "IME_RELACION_CLI")
	private String imeRelacionCli;
	
	@Column(name = "IML_RELACION_CLI")
	private String imlRelacionCli;
	
	@Column(name = "IMV_RELACION_CAL")
	private int imvRelacionCal;
	
	@Column(name = "IMO_RELACION_CAL")
	private String imoRelacionCal;
	
	@Column(name = "IME_RELACION_CAL")
	private String imeRelacionCal;
	
	@Column(name = "IML_RELACION_CAL")
	private String imlRelacionCal;
	
	@Column(name = "IMV_RELACION_VIN")
	private int imvRelacionVin;
	
	@Column(name = "IMO_RELACION_VIN")
	private String imoRelacionVin;
	
	@Column(name = "IME_RELACION_VIN")
	private String imeRelacionVin;
	
	@Column(name = "IML_RELACION_VIN")
	private String imlRelacionVin;
	
	@Column(name = "IMV_MARCA")
	private int imvMarca;
	
	@Column(name = "IMO_MARCA")
	private String imoMarca;
	
	@Column(name = "IME_MARCA")
	private String imeMarca;
	
	@Column(name = "IML_MARCA")
	private String imlMarca;
}
