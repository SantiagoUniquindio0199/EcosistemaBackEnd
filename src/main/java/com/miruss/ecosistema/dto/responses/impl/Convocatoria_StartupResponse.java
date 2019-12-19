package com.miruss.ecosistema.dto.responses.impl;

import java.util.ArrayList;

import com.miruss.ecosistema.dto.responses.Response;
import com.miruss.ecosistema.models.Convocatoria_Startup;

public class Convocatoria_StartupResponse extends Response{
	
	private Convocatoria_Startup convocatoria_startup;
	
	private ArrayList<Convocatoria_Startup> convocatorias_startup;

	public Convocatoria_Startup getConvocatoria_startup() {
		return convocatoria_startup;
	}

	public void setConvocatoria_startup(Convocatoria_Startup convocatoria_startup) {
		this.convocatoria_startup = convocatoria_startup;
	}

	public ArrayList<Convocatoria_Startup> getConvocatorias_startup() {
		return convocatorias_startup;
	}

	public void setConvocatorias_startup(ArrayList<Convocatoria_Startup> convocatorias_startup) {
		this.convocatorias_startup = convocatorias_startup;
	}
	
}
