package com.miruss.ecosistema.dto.responses.impl;

import java.util.ArrayList;

import com.miruss.ecosistema.dto.responses.Response;
import com.miruss.ecosistema.models.Entidad;

public class EntidadResponse extends Response{
	
	private Entidad entidad;
	
	private ArrayList<Entidad> entidades;

	public Entidad getEntidad() {
		return entidad;
	}

	public void setEntidad(Entidad entidad) {
		this.entidad = entidad;
	}

	public ArrayList<Entidad> getEntidades() {
		return entidades;
	}

	public void setEntidades(ArrayList<Entidad> entidades) {
		this.entidades = entidades;
	}

}
