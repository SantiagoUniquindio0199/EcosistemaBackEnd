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
import com.miruss.ecosistema.dto.responses.impl.EntidadResponse;
import com.miruss.ecosistema.enums.ResponseEnum;
import com.miruss.ecosistema.factorys.ResponseFactory;
import com.miruss.ecosistema.models.Entidad;
import com.miruss.ecosistema.services.EntidadService;

@RestController
@RequestMapping("/entidad")
public class EntidadController {
	
	@Autowired
	EntidadService entidadService;
	
	@Autowired
	ResponseFactory responseFactory;
	
	@Value("${message.error}")
	private String messageError;
	
	@CrossOrigin(origins = "https://ecosistema-frontend.herokuapp.com")
	@RequestMapping(value = "/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Response saveEntidad(@RequestBody Entidad entidad) {
		try {
			return entidadService.save(entidad);
		}catch (Exception e) {
			EntidadResponse response = (EntidadResponse) responseFactory.getResponse(ResponseEnum.ENTIDAD);
			response.setCodigo(CodeResponseDefine.error);
			response.setMensaje(messageError);
			return response;
		}
	}
	
	@CrossOrigin(origins = "https://ecosistema-frontend.herokuapp.com")
	@RequestMapping(value = "/delete/{nombre}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Response deleteEntidad(@PathVariable("nombre") String nombre) {
		try {
			return entidadService.deleteByNombre(nombre);
		}catch (Exception e) {
			EntidadResponse response = (EntidadResponse) responseFactory.getResponse(ResponseEnum.ENTIDAD);
			response.setCodigo(CodeResponseDefine.error);
			response.setMensaje(messageError);
			return response;
		}
	}
	
	@CrossOrigin(origins = "https://ecosistema-frontend.herokuapp.com")
	@RequestMapping(value = "/todos", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Response findAllEntidades() {
		try {
			return entidadService.findAll();
		}catch (Exception e) {
			EntidadResponse response = (EntidadResponse) responseFactory.getResponse(ResponseEnum.ENTIDAD);
			response.setCodigo(CodeResponseDefine.error);
			response.setMensaje(messageError);
			return response;
		}
	}
	
	@CrossOrigin(origins = "https://ecosistema-frontend.herokuapp.com")
	@RequestMapping(value = "/nombre/{nombre}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Response findByNombreEntidad(@PathVariable("nombre") String nombre) {
		try {
			return entidadService.findByNombre(nombre);
		}catch (Exception e) {
			EntidadResponse response = (EntidadResponse) responseFactory.getResponse(ResponseEnum.ENTIDAD);
			response.setCodigo(CodeResponseDefine.error);
			response.setMensaje(messageError);
			return response;
		}
	}
	
	@CrossOrigin(origins = "https://ecosistema-frontend.herokuapp.com")
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Response findByIdEntidad(@PathVariable("id") Long id) {
		try {
			return entidadService.findById(id);
		}catch (Exception e) {
			EntidadResponse response = (EntidadResponse) responseFactory.getResponse(ResponseEnum.ENTIDAD);
			response.setCodigo(CodeResponseDefine.error);
			response.setMensaje(messageError);
			return response;
		}
	}

}
