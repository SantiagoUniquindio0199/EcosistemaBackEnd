package com.miruss.ecosistema.dto.responses.impl;

import java.util.ArrayList;

import com.miruss.ecosistema.dto.responses.Response;
import com.miruss.ecosistema.models.Convocatoria;
import com.miruss.ecosistema.models.Startup;

public class StartupResponse extends Response{
	
	private Startup startup;
	
	private ArrayList<Startup> startups;
	
	private ArrayList<Convocatoria> convocatorias;
	
	public ArrayList<Startup> getStartups() {
		return startups;
	}

	public void setStartups(ArrayList<Startup> startups) {
		this.startups = startups;
	}

	public Startup getStartup() {
		return startup;
	}

	public void setStartup(Startup startup) {
		this.startup = startup;
	}

	public ArrayList<Convocatoria> getConvocatorias() {
		return convocatorias;
	}

	public void setConvocatorias(ArrayList<Convocatoria> convocatorias) {
		this.convocatorias = convocatorias;
	}
	
}
