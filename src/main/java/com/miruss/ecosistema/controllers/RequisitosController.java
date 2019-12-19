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
import com.miruss.ecosistema.dto.responses.impl.RequisitosResponse;
import com.miruss.ecosistema.enums.ResponseEnum;
import com.miruss.ecosistema.factorys.ResponseFactory;
import com.miruss.ecosistema.models.Requisitos;
import com.miruss.ecosistema.services.RequisitosService;

@RestController
@RequestMapping("/requisitos")
public class RequisitosController {
	
	@Autowired
	RequisitosService requisitosService;
	
	@Autowired
	ResponseFactory responseFactory;
	
	@Value("$message.error")
	private String messageError;
	
	@CrossOrigin(origins = "https://ecosistema-frontend.herokuapp.com")
	@RequestMapping(value = "/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Response saveRequisito(@RequestBody Requisitos requisito) {
		try {
			return requisitosService.save(requisito);
		}catch (Exception e) {
			RequisitosResponse response = (RequisitosResponse) responseFactory.getResponse(ResponseEnum.REQUISITOS);
			response.setCodigo(CodeResponseDefine.error);
			response.setMensaje(messageError);
			return response;
		}
	}
	
	@CrossOrigin(origins = "https://ecosistema-frontend.herokuapp.com")
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Response findByIdRequisito(@PathVariable("id") long id) {
		try {
			return requisitosService.findByIdReq(id);
		}catch (Exception e) {
			RequisitosResponse response = (RequisitosResponse) responseFactory.getResponse(ResponseEnum.REQUISITOS);
			response.setCodigo(CodeResponseDefine.error);
			response.setMensaje(messageError);
			return response;
		}
	}
	
}
