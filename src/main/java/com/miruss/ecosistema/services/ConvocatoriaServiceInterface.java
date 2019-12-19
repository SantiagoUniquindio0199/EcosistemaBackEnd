package com.miruss.ecosistema.services;

import com.miruss.ecosistema.dto.responses.Response;
import com.miruss.ecosistema.models.Convocatoria;
import com.miruss.ecosistema.models.Entidad;

public interface ConvocatoriaServiceInterface {
	
	public Response save(Convocatoria producto) throws Exception;
	
	public Response findByNombre(String nombre) throws Exception;
	
	public Response findByEntidad(Entidad entidad) throws Exception;
	
	public Response deleteByNombre(String nombre) throws Exception;
	
	public Response findAll() throws Exception;
	
	public void cerrarConvocatoria();

}
