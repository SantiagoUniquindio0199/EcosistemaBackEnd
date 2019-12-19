package com.miruss.ecosistema.services;

import java.util.ArrayList;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.miruss.ecosistema.defines.CodeResponseDefine;
import com.miruss.ecosistema.dto.responses.Response;
import com.miruss.ecosistema.dto.responses.impl.EntidadResponse;
import com.miruss.ecosistema.enums.ResponseEnum;
import com.miruss.ecosistema.factorys.ResponseFactory;
import com.miruss.ecosistema.models.Entidad;
import com.miruss.ecosistema.repositorys.EntidadRepository;

@Service
@Transactional
public class EntidadService implements EntidadServiceInterface{

	@Autowired
	EntidadRepository entidadRepository;
	
	@Autowired
	ResponseFactory responseFactory;
	
	@Value("${message.success}")
	private String messageSucces;
	
	@Override
	public Response save(Entidad entidad) throws Exception{
		entidadRepository.save(entidad);
		EntidadResponse response = (EntidadResponse) responseFactory.getResponse(ResponseEnum.ENTIDAD);
		response.setCodigo(CodeResponseDefine.success);
		response.setMensaje(messageSucces);
		response.setEntidad(entidad);
		return response;
	}

	@Override
	public Response findByNombre(String nombre) throws Exception {
		Entidad entidad = entidadRepository.findByNombre(nombre);
		if(entidad != null) {
			EntidadResponse response = (EntidadResponse) responseFactory.getResponse(ResponseEnum.ENTIDAD);
			response.setCodigo(CodeResponseDefine.success);
			response.setMensaje(messageSucces);
			response.setEntidad(entidad);
			return response;
		}else {
			throw new Exception("ERROR NO EXISTE EL PRODUCTO");
		}
	}
	
	@Override
	public Response findAll() throws Exception {
		ArrayList<Entidad> entidades = (ArrayList<Entidad>) entidadRepository.findAll();
		if(entidades.size() > 0) {
			EntidadResponse response = (EntidadResponse) responseFactory.getResponse(ResponseEnum.ENTIDAD);
			response.setCodigo(CodeResponseDefine.success);
			response.setMensaje(messageSucces);
			response.setEntidades(entidades);
			return response;
		}else {
			throw new Exception("ERROR NO EXISTEN PRODUCTOS");
		}
	}
	
	@Override
	public Response deleteByNombre(String nombre) throws Exception {
		entidadRepository.deleteByNombre(nombre);
		EntidadResponse response = (EntidadResponse) responseFactory.getResponse(ResponseEnum.ENTIDAD);
		response.setCodigo(CodeResponseDefine.success);
		response.setMensaje(messageSucces);
		return response;
	}
	
	@Override
	public Response findById(Long id) throws Exception {
		Optional<Entidad> entidad = entidadRepository.findById(id);
		if(entidad.isPresent()) {
			EntidadResponse response = (EntidadResponse) responseFactory.getResponse(ResponseEnum.ENTIDAD);
			response.setCodigo(CodeResponseDefine.success);
			response.setMensaje(messageSucces);
			response.setEntidad(entidad.get());
			return response;
		} else {
			throw new Exception("ERROR NO EXISTE EL PRODUCTO");
		}
	}

}
