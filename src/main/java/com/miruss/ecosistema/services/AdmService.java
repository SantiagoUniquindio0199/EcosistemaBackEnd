package com.miruss.ecosistema.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.miruss.ecosistema.defines.CodeResponseDefine;
import com.miruss.ecosistema.dto.responses.Response;
import com.miruss.ecosistema.dto.responses.impl.AdmResponse;
import com.miruss.ecosistema.enums.ResponseEnum;
import com.miruss.ecosistema.factorys.ResponseFactory;
import com.miruss.ecosistema.models.Adm;
import com.miruss.ecosistema.repositorys.AdmRepository;

@Service
@Transactional
public class AdmService implements AdmServiceInterface{

	@Autowired
	AdmRepository admRepository;
	
	@Autowired
	ResponseFactory responseFactory;
	
	@Value("${message.success}")
	private String messageSucces;
	
	@Override
	public Response save(Adm adm) throws Exception{
		admRepository.save(adm);
		AdmResponse response = (AdmResponse) responseFactory.getResponse(ResponseEnum.ADM);
		response.setCodigo(CodeResponseDefine.success);
		response.setMensaje(messageSucces);
		response.setAdm(adm);
		return response;
	}
 
	@Override
	public Response findByCorreo(String correo) throws Exception{
		Adm adm = admRepository.findByCor(correo);
		if(adm != null)  {
			AdmResponse response = (AdmResponse) responseFactory.getResponse(ResponseEnum.ADM);
			response.setAdm(adm);
			response.setCodigo(CodeResponseDefine.success);
			response.setMensaje(messageSucces);
			return response;
		}else {
			throw new Exception("ERROR EL ADMIN NO SE ENCONTRO");
		}
	}

	@Override
	public Response deleteByCorreo(String correo) {
		admRepository.deleteByCor(correo);
		AdmResponse response = (AdmResponse) responseFactory.getResponse(ResponseEnum.ADM);
		response.setCodigo(CodeResponseDefine.success);
		response.setMensaje(messageSucces);
		return response;
	}

}
