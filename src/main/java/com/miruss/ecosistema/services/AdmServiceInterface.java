package com.miruss.ecosistema.services;

import com.miruss.ecosistema.dto.responses.Response;
import com.miruss.ecosistema.models.Adm;

public interface AdmServiceInterface {
	
	public Response save(Adm adm) throws Exception;
	
	public Response findByCorreo(String correo) throws Exception;
	
	public Response deleteByCorreo(String correo) throws Exception;

}
