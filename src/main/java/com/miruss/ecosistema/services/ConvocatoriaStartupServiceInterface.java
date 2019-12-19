package com.miruss.ecosistema.services;

import com.miruss.ecosistema.dto.responses.Response;
import com.miruss.ecosistema.models.Convocatoria;
import com.miruss.ecosistema.models.Convocatoria_Startup;
import com.miruss.ecosistema.models.Startup;

public interface ConvocatoriaStartupServiceInterface {

	public Response save(Convocatoria_Startup convocatoria_startup) throws Exception;
	
	public Response findAllStartup(Startup startup) throws Exception;
	
	public Response findAllConvocatoria(Convocatoria convocatoria) throws Exception;
	
	public Response findByStarConv(Startup startup, Convocatoria convocatoria) throws Exception;
	
	public Response deleteByConvocatoria(Convocatoria convocatoria) throws Exception;
	
}
