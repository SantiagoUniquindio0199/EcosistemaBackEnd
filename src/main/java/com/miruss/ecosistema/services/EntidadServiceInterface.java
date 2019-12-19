package com.miruss.ecosistema.services;

import com.miruss.ecosistema.dto.responses.Response;
import com.miruss.ecosistema.models.Entidad;

public interface EntidadServiceInterface {
	
	public Response save(Entidad entidad) throws Exception;
	
	public Response findById(Long id) throws Exception;
	
	public Response findByNombre(String nombre) throws Exception;
	
	public Response findAll() throws Exception;
	
	public Response deleteByNombre(String nombre) throws Exception;

}
