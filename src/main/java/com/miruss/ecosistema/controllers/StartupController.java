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
import com.miruss.ecosistema.dto.responses.impl.StartupResponse;
import com.miruss.ecosistema.enums.ResponseEnum;
import com.miruss.ecosistema.factorys.ResponseFactory;
import com.miruss.ecosistema.models.Startup;
import com.miruss.ecosistema.services.StartupService;

@RestController
@RequestMapping("/startup")
public class StartupController {
	
	@Autowired
	StartupService startupService;
	
	@Autowired
	ResponseFactory responseFactory;
	
	@Value("${message.error}")
	private String messageError;

	@CrossOrigin(origins = "https://ecosistema-frontend.herokuapp.com")
	@RequestMapping(value = "/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Response saveStartup(@RequestBody Startup startup) {
		try {
			return startupService.save(startup);
		}catch (Exception e) {
			StartupResponse response = (StartupResponse) responseFactory.getResponse(ResponseEnum.STARTUP);
			response.setCodigo(CodeResponseDefine.error);
			response.setMensaje(messageError);
			return response;
		}
	} 
	
	@CrossOrigin(origins = "https://ecosistema-frontend.herokuapp.com")
	@RequestMapping(value = "/nombre/{nombre}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Response findByNombreStartup(@PathVariable("nombre") String nombre) {
		try {
			return startupService.findByNombre(nombre);
		}catch (Exception e) {
			StartupResponse response = (StartupResponse) responseFactory.getResponse(ResponseEnum.STARTUP);
			response.setCodigo(CodeResponseDefine.error);
			response.setMensaje(messageError);
			return response;
		}
	}
	
	@CrossOrigin(origins = "https://ecosistema-frontend.herokuapp.com")
	@RequestMapping(value = "/delete/{nombre}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Response deleteStartup(@PathVariable("nombre") String nombre) {
		try {
			return startupService.deleteByNombre(nombre);
		}catch (Exception e) {
			StartupResponse response = (StartupResponse) responseFactory.getResponse(ResponseEnum.STARTUP);
			response.setCodigo(CodeResponseDefine.error);
			response.setMensaje(messageError);
			return response;
		}
	}
	
	@CrossOrigin(origins = "https://ecosistema-frontend.herokuapp.com")
	@RequestMapping(value = "/todos", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Response findAllStartups() {
		try {
			return startupService.findAll();
		}catch (Exception e) {
			StartupResponse response = (StartupResponse) responseFactory.getResponse(ResponseEnum.STARTUP);
			response.setCodigo(CodeResponseDefine.error);
			response.setMensaje(messageError);
			return response;
		}
	}
	
	@CrossOrigin(origins = "https://ecosistema-frontend.herokuapp.com")
	@RequestMapping(value = "/convocatorias/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Response findByStartupConvocatoria(@PathVariable("id") Long id) {
		try {
			return startupService.findConvByStartup(id);
		}catch (Exception e) {
			StartupResponse response = (StartupResponse) responseFactory.getResponse(ResponseEnum.STARTUP);
			response.setCodigo(CodeResponseDefine.error);
			response.setMensaje(messageError);
			return response;
		}
	}
	
	@CrossOrigin(origins = "https://ecosistema-frontend.herokuapp.com")
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Response findByIdStartup(@PathVariable("id") long id) {
		try {
			return startupService.findById(id);
		}catch (Exception e) {
			StartupResponse response = (StartupResponse) responseFactory.getResponse(ResponseEnum.STARTUP);
			response.setCodigo(CodeResponseDefine.error);
			response.setMensaje(messageError);
			return response;
		}
	}
}
