package com.miruss.ecosistema.dto.responses.impl;

import com.miruss.ecosistema.dto.responses.Response;
import com.miruss.ecosistema.models.Requisitos;

public class RequisitosResponse extends Response{
	
	private Requisitos requisito;

	public Requisitos getRequisito() {
		return requisito;
	}

	public void setRequisito(Requisitos requisito) {
		this.requisito = requisito;
	}

}
