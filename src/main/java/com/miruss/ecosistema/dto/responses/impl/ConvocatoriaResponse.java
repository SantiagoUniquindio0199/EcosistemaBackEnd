package com.miruss.ecosistema.dto.responses.impl;

import java.util.ArrayList;

import com.miruss.ecosistema.dto.responses.Response;
import com.miruss.ecosistema.models.Convocatoria;

public class ConvocatoriaResponse extends Response{
	
	private Convocatoria convocatoria;
	
	private ArrayList<Convocatoria> convocatorias;

	public Convocatoria getConvocatoria() {
		return convocatoria;
	}

	public void setConvocatoria(Convocatoria convocatoria) {
		this.convocatoria = convocatoria;
	}

	public ArrayList<Convocatoria> getConvocatorias() {
		return convocatorias;
	}

	public void setConvocatorias(ArrayList<Convocatoria> convocatorias) {
		this.convocatorias = convocatorias;
	}

}
