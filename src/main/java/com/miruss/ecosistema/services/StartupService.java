package com.miruss.ecosistema.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.miruss.ecosistema.defines.CodeResponseDefine;
import com.miruss.ecosistema.dto.responses.Response;
import com.miruss.ecosistema.dto.responses.impl.StartupResponse;
import com.miruss.ecosistema.enums.ResponseEnum;
import com.miruss.ecosistema.factorys.ResponseFactory;
import com.miruss.ecosistema.models.Convocatoria;
import com.miruss.ecosistema.models.Startup;
import com.miruss.ecosistema.repositorys.StartupRepository;

@Service
@Transactional
public class StartupService implements StartupServiceInterface{

	@Autowired
	StartupRepository startupRepository;
	
	@Autowired
	ResponseFactory responseFactory;
	
	@Value("${message.success}")
	private String messageSuccess;
	
	@Override
	public Response save(Startup startup) throws Exception {
		startupRepository.save(startup);
		StartupResponse response = (StartupResponse) responseFactory.getResponse(ResponseEnum.STARTUP);
		response.setCodigo(CodeResponseDefine.success);
		response.setMensaje(messageSuccess);
		response.setStartup(startup);
		return response;
	}
	
	@Override
	public Response findByNombre(String nombre) throws Exception{
		Startup startup = startupRepository.findByNombre(nombre);
		if(startup != null){
			StartupResponse response = (StartupResponse) responseFactory.getResponse(ResponseEnum.STARTUP);
			response.setCodigo(CodeResponseDefine.success);
			response.setMensaje(messageSuccess);
			response.setStartup(startup);
			return response;
		}else {
			throw new Exception("ERROR NO EXISTE LA STARTUP");
		}
	}
	
	@Override
	public Response findAll() throws Exception {
		ArrayList<Startup> startups = (ArrayList<Startup>) startupRepository.findAll();
		if(startups.size() > 0) {
			StartupResponse response = (StartupResponse) responseFactory.getResponse(ResponseEnum.STARTUP);
			response.setCodigo(CodeResponseDefine.success);
			response.setMensaje(messageSuccess);
			response.setStartups(startups);
			return response;
		}else {
			throw new Exception("ERROR NO EXISTEN STARTUPS");
		}
	}
	
	@Override
	public Response findConvByStartup(Long id) throws Exception {
		ArrayList<Convocatoria> convocatorias = (ArrayList<Convocatoria>) startupRepository.findAllConvById(id);
		if(convocatorias.size() > 0) {
			StartupResponse response = (StartupResponse) responseFactory.getResponse(ResponseEnum.STARTUP);
			response.setCodigo(CodeResponseDefine.success);
			response.setMensaje(messageSuccess);
			response.setConvocatorias(convocatorias);
			return response;
		}else {
			throw new Exception("NO SE ENCONTRARON CONVOCATORIAS");
		}
	}
	
	@Override
	public Response deleteByNombre(String nombre) throws Exception {
		startupRepository.deleteByNombre(nombre);
		StartupResponse response = (StartupResponse) responseFactory.getResponse(ResponseEnum.STARTUP);
		response.setCodigo(CodeResponseDefine.success);
		response.setMensaje(messageSuccess);
		return response;
	}

	@Override
	public Response findById(Long id) throws Exception{
		Optional<Startup> startup = startupRepository.findById(id);
		if(startup.isPresent()){
			StartupResponse response = (StartupResponse) responseFactory.getResponse(ResponseEnum.STARTUP);
			response.setCodigo(CodeResponseDefine.success);
			response.setMensaje(messageSuccess);
			response.setStartup(startup.get());
			return response;
		}else {
			throw new Exception("ERROR NO EXISTE LA STARTUP");
		}
	}
}
