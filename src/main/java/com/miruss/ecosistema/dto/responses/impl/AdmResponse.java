package com.miruss.ecosistema.dto.responses.impl;

import com.miruss.ecosistema.dto.responses.Response;
import com.miruss.ecosistema.models.Adm;

public class AdmResponse extends Response{
	
	private Adm adm;

	public Adm getAdm() {
		return adm;
	}

	public void setAdm(Adm adm) {
		this.adm = adm;
	}

}
