package com.miruss.ecosistema.services;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.miruss.ecosistema.defines.CodeResponseDefine;
import com.miruss.ecosistema.dto.responses.Response;
import com.miruss.ecosistema.dto.responses.impl.Convocatoria_StartupResponse;
import com.miruss.ecosistema.enums.ResponseEnum;
import com.miruss.ecosistema.factorys.ResponseFactory;
import com.miruss.ecosistema.models.Convocatoria;
import com.miruss.ecosistema.models.Convocatoria_Startup;
import com.miruss.ecosistema.models.Startup;
import com.miruss.ecosistema.repositorys.ConvocatoriaStartupRepositoty;

@Service
@Transactional
public class ConvocatoriaStartupService implements ConvocatoriaStartupServiceInterface{

	@Autowired
	ConvocatoriaStartupRepositoty convocatoria_startupRepository;
	
	@Autowired
	ResponseFactory responseFactory;
	
	@Value("${message.success}")
	private String messageSuccess;
	
	@Override
	public Response save(Convocatoria_Startup convocatoria_startup) throws Exception {
		convocatoria_startupRepository.save(convocatoria_startup);
		Convocatoria_StartupResponse response = (Convocatoria_StartupResponse) responseFactory.getResponse(ResponseEnum.CONVOCATORIA_STARTUP);
		response.setCodigo(CodeResponseDefine.success);
		response.setMensaje(messageSuccess);
		response.setConvocatoria_startup(convocatoria_startup);
		return response;
	}

	@Override
	public Response findAllStartup(Startup startup) throws Exception{
		ArrayList<Convocatoria_Startup> convocatorias_startup = (ArrayList<Convocatoria_Startup>) convocatoria_startupRepository.findAllByStartupApli(startup);
		if(convocatorias_startup.size() > 0){
			Convocatoria_StartupResponse response = (Convocatoria_StartupResponse) responseFactory.getResponse(ResponseEnum.CONVOCATORIA_STARTUP);
			response.setCodigo(CodeResponseDefine.success);
			response.setMensaje(messageSuccess);
			response.setConvocatorias_startup(convocatorias_startup);
			return response;
		}else {
			throw new Exception("ERROR NO EXISTE LA RELACION");
		}
	}
	
	@Override
	public Response findAllConvocatoria(Convocatoria convocatoria) throws Exception{
		ArrayList<Convocatoria_Startup> convocatorias_startup = (ArrayList<Convocatoria_Startup>) convocatoria_startupRepository.findAllByConvocatoriaApli(convocatoria);
		if(convocatorias_startup.size() > 0){
			Convocatoria_StartupResponse response = (Convocatoria_StartupResponse) responseFactory.getResponse(ResponseEnum.CONVOCATORIA_STARTUP);
			response.setCodigo(CodeResponseDefine.success);
			response.setMensaje(messageSuccess);
			response.setConvocatorias_startup(convocatorias_startup);
			return response;
		}else {
			throw new Exception("ERROR NO EXISTE LA RELACION");
		}
	}

	@Override
	public Response findByStarConv(Startup startup, Convocatoria convocatoria) throws Exception {
		Convocatoria_Startup convocatoria_startup = convocatoria_startupRepository.findByStartupApliAndConvocatoriaApli(startup, convocatoria);
		if(convocatoria_startup != null) {
			Convocatoria_StartupResponse response = (Convocatoria_StartupResponse) responseFactory.getResponse(ResponseEnum.CONVOCATORIA_STARTUP);
			response.setCodigo(CodeResponseDefine.success);
			response.setMensaje(messageSuccess);
			response.setConvocatoria_startup(convocatoria_startup);
			return response;
		}else {
			throw new Exception("ERROR NO EXISTE LA CONVOCATORIA");
		}
	}
	
	@Override
	public Response deleteByConvocatoria(Convocatoria convocatoria) throws Exception {
		convocatoria_startupRepository.deleteByConvocatoriaApli(convocatoria);
		Convocatoria_StartupResponse response = (Convocatoria_StartupResponse) responseFactory.getResponse(ResponseEnum.CONVOCATORIA_STARTUP);
		response.setCodigo(CodeResponseDefine.success);
		response.setMensaje(messageSuccess);
		return response;
	}
}
