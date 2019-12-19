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
import com.miruss.ecosistema.dto.responses.impl.ConvocatoriaResponse;
import com.miruss.ecosistema.enums.ResponseEnum;
import com.miruss.ecosistema.factorys.ResponseFactory;
import com.miruss.ecosistema.models.Convocatoria;
import com.miruss.ecosistema.models.Entidad;
import com.miruss.ecosistema.services.ConvocatoriaService;

@RestController
@RequestMapping("/convocatoria")
public class ConvocatoriaController {
	
	@Autowired
	ConvocatoriaService convocatoriaService;
	
	@Autowired
	ResponseFactory responseFactory;
	
	@Value("${message.error}")
	private String messageError;
	
	@CrossOrigin(origins = "https://ecosistema-frontend.herokuapp.com")
	@RequestMapping(value = "/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Response saveConvocatoria(@RequestBody Convocatoria convocatoria) {
		try {
			return convocatoriaService.save(convocatoria);
		}catch (Exception e) {
			ConvocatoriaResponse response = (ConvocatoriaResponse) responseFactory.getResponse(ResponseEnum.CONVOCATORIA);
			response.setCodigo(CodeResponseDefine.error);
			response.setMensaje(messageError);
			return response;
		}
	}
	
	@CrossOrigin(origins = "https://ecosistema-frontend.herokuapp.com")
	@RequestMapping(value = "/delete/{nombre}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Response deleteConvocatoria(@PathVariable("nombre") String nombre) {
		try {
			return convocatoriaService.deleteByNombre(nombre);
		}catch (Exception e) {
			ConvocatoriaResponse response = (ConvocatoriaResponse) responseFactory.getResponse(ResponseEnum.CONVOCATORIA);
			response.setCodigo(CodeResponseDefine.error);
			response.setMensaje(messageError);
			return response;
		}
	}
	
	@CrossOrigin(origins = "https://ecosistema-frontend.herokuapp.com")
	@RequestMapping(value = "/nombre/{nombre}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Response findByNombreConvocatoria(@PathVariable("nombre") String nombre) {
		try {
			return convocatoriaService.findByNombre(nombre);
		}catch (Exception e) {
			ConvocatoriaResponse response = (ConvocatoriaResponse) responseFactory.getResponse(ResponseEnum.CONVOCATORIA);
			response.setCodigo(CodeResponseDefine.error);
			response.setMensaje(messageError);
			return response;
		}
	}
	
	@CrossOrigin(origins = "https://ecosistema-frontend.herokuapp.com")
	@RequestMapping(value = "/entidad/{entidad}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Response findByEntidadConvocatoria(@PathVariable("entidad") Entidad entidad) {
		try {
			return convocatoriaService.findByEntidad(entidad);
		}catch (Exception e) {
			ConvocatoriaResponse response = (ConvocatoriaResponse) responseFactory.getResponse(ResponseEnum.CONVOCATORIA);
			response.setCodigo(CodeResponseDefine.error);
			response.setMensaje(messageError);
			return response;
		}
	}
	@CrossOrigin(origins = "https://ecosistema-frontend.herokuapp.com")
	@RequestMapping(value = "/todos", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Response findAllConvocatorias() {
		try {
			return convocatoriaService.findAll();
		}catch (Exception e) {
			ConvocatoriaResponse response = (ConvocatoriaResponse) responseFactory.getResponse(ResponseEnum.CONVOCATORIA);
			response.setCodigo(CodeResponseDefine.error);
			response.setMensaje(messageError);
			return response;
		}
	}
}
