package com.miruss.ecosistema.services;

import com.miruss.ecosistema.dto.responses.Response;
import com.miruss.ecosistema.models.Requisitos;

public interface RequisitosServiceInterface {

	public Response save(Requisitos requisito);
	
	public Response findByIdReq(Long id) throws Exception;
	
}
