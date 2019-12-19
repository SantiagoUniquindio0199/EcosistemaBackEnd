package com.miruss.ecosistema.services;

import java.util.ArrayList;

import com.miruss.ecosistema.dto.responses.Response;
import com.miruss.ecosistema.models.Producto;
import com.miruss.ecosistema.models.Startup;

public interface ProductoServiceInterface {
	
	public Response save(Producto producto) throws Exception;
	
	public Response findById(Long id) throws Exception;
	
	public Response findByNombre(String nombre) throws Exception;
	
	public Response findByStartup(Startup startup) throws Exception;
	
	public Response findAll() throws Exception;
	
	public Response deleteByNombre(String nombre);
	
	public Response deleteAll(ArrayList<Producto> productos) throws Exception;

}
