package com.miruss.ecosistema.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.miruss.ecosistema.defines.CodeResponseDefine;
import com.miruss.ecosistema.dto.responses.Response;
import com.miruss.ecosistema.dto.responses.impl.Convocatoria_StartupResponse;
import com.miruss.ecosistema.enums.ResponseEnum;
import com.miruss.ecosistema.factorys.ResponseFactory;
import com.miruss.ecosistema.models.Convocatoria;
import com.miruss.ecosistema.models.Convocatoria_Startup;
import com.miruss.ecosistema.models.Startup;
import com.miruss.ecosistema.services.ConvocatoriaStartupService;

@RestController
@RequestMapping("/convocatoria_startup")
public class ConvocatoriaStartupController {
	
	@Autowired
	ConvocatoriaStartupService convocatoria_startupService;
	
	@Autowired
	ResponseFactory responseFactory;
	
	@Value("${message.error}")
	private String messageError;
	
	@CrossOrigin(origins = "https://ecosistema-frontend.herokuapp.com")
	@RequestMapping(value = "/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Response saveConvocatoria_startup(@RequestBody Convocatoria_Startup convocatoria_startup) {
		try {
			return convocatoria_startupService.save(convocatoria_startup);
		}catch (Exception e) {
			Convocatoria_StartupResponse response = (Convocatoria_StartupResponse) responseFactory.getResponse(ResponseEnum.CONVOCATORIA_STARTUP);
			response.setCodigo(CodeResponseDefine.error);
			//response.setMensaje(messageError);
			response.setMensaje(e.getMessage());
			return response;
		}
	}
	
	@CrossOrigin(origins = "https://ecosistema-frontend.herokuapp.com")
	@RequestMapping(value = "/startup/{startup}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Response findByStartupConvocatorias_Startup(@PathVariable("startup") Startup startup) {
		try {
			return convocatoria_startupService.findAllStartup(startup);
		}catch (Exception e) {
			Convocatoria_StartupResponse response = (Convocatoria_StartupResponse) responseFactory.getResponse(ResponseEnum.CONVOCATORIA_STARTUP);
			response.setCodigo(CodeResponseDefine.error);
			response.setMensaje(messageError);
			return response;
		}
	}
	
	@CrossOrigin(origins = "https://ecosistema-frontend.herokuapp.com")
	@RequestMapping(value = "/convocatoria/{convocatoria}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Response findByStartupConvocatorias_Startup(@PathVariable("convocatoria") Convocatoria convocatoria) {
		try {
			return convocatoria_startupService.findAllConvocatoria(convocatoria);
		}catch (Exception e) {
			Convocatoria_StartupResponse response = (Convocatoria_StartupResponse) responseFactory.getResponse(ResponseEnum.CONVOCATORIA_STARTUP);
			response.setCodigo(CodeResponseDefine.error);
			response.setMensaje(messageError);
			return response;
		}
	}
	
	@CrossOrigin(origins = "https://ecosistema-frontend.herokuapp.com")
	@RequestMapping(value = "/ambos/{startup}/{convocatoria}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Response findByStarConv(@PathVariable("startup") Startup startup, @PathVariable("convocatoria") Convocatoria convocatoria) {
		try {
			return convocatoria_startupService.findByStarConv(startup, convocatoria);
		}catch (Exception e) {
			Convocatoria_StartupResponse response = (Convocatoria_StartupResponse) responseFactory.getResponse(ResponseEnum.CONVOCATORIA_STARTUP);
			response.setCodigo(CodeResponseDefine.error);
			response.setMensaje(messageError);
			return response;
		}
	}
	
	@CrossOrigin(origins = "https://ecosistema-frontend.herokuapp.com")
	@RequestMapping(value = "/delete/convocatoria/{convocatoria}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Response deleteByConv(@PathVariable("convocatoria") Convocatoria convocatoria) {
		try {
			return convocatoria_startupService.deleteByConvocatoria(convocatoria);
		}catch (Exception e) {
			Convocatoria_StartupResponse response = (Convocatoria_StartupResponse) responseFactory.getResponse(ResponseEnum.CONVOCATORIA_STARTUP);
			response.setCodigo(CodeResponseDefine.error);
			response.setMensaje(messageError);
			return response;
		}
	}
}