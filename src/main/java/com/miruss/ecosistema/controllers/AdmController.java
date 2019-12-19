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
import com.miruss.ecosistema.dto.responses.impl.AdmResponse;
import com.miruss.ecosistema.enums.ResponseEnum;
import com.miruss.ecosistema.factorys.ResponseFactory;
import com.miruss.ecosistema.models.Adm;
import com.miruss.ecosistema.services.AdmService;

@RestController
@RequestMapping("/adm")
public class AdmController {
	
	@Autowired
	ResponseFactory responseFactory;
	
	@Autowired
	AdmService admService;
	
	@Value("$message.error")
	private String messageError;
	
	@CrossOrigin(origins = "https://ecosistema-frontend.herokuapp.com")
	@RequestMapping(value = "/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Response saveAdm(@RequestBody Adm adm) {
		try {
			 return admService.save(adm);
		}catch (Exception e) {
			AdmResponse response = (AdmResponse) responseFactory.getResponse(ResponseEnum.ADM);
			response.setCodigo(CodeResponseDefine.error);
			response.setMensaje(messageError);
			return response;
		}
	}
	
	@CrossOrigin(origins = "https://ecosistema-frontend.herokuapp.com")
	@RequestMapping(value = "/correo/{correo}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Response findByCorreoAdm(@PathVariable("correo") String correo) {
		try {
			 return admService.findByCorreo(correo);
		}catch (Exception e) {
			AdmResponse response = (AdmResponse) responseFactory.getResponse(ResponseEnum.ADM);
			response.setCodigo(CodeResponseDefine.error);
			response.setMensaje(messageError);
			return response;
		}
	}
	
	@CrossOrigin(origins = "https://ecosistema-frontend.herokuapp.com")
	@RequestMapping(value = "/delete/{correo}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Response deleleteByCorreoAdm(@PathVariable("correo") String correo) {
		try {
			 return admService.deleteByCorreo(correo);
		}catch (Exception e) {
			AdmResponse response = (AdmResponse) responseFactory.getResponse(ResponseEnum.ADM);
			response.setCodigo(CodeResponseDefine.error);
			response.setMensaje(messageError);
			return response;
		}
	}
}
