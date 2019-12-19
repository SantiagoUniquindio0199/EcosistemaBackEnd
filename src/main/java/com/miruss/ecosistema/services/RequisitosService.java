package com.miruss.ecosistema.services;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.miruss.ecosistema.defines.CodeResponseDefine;
import com.miruss.ecosistema.dto.responses.Response;
import com.miruss.ecosistema.dto.responses.impl.RequisitosResponse;
import com.miruss.ecosistema.enums.ResponseEnum;
import com.miruss.ecosistema.factorys.ResponseFactory;
import com.miruss.ecosistema.models.Requisitos;
import com.miruss.ecosistema.repositorys.RequisitosRepository;

@Service
@Transactional
public class RequisitosService implements RequisitosServiceInterface{

	@Autowired
	ResponseFactory responseFactory;
	
	@Autowired
	RequisitosRepository requisitosRepository;
	
	@Value("$message.success")
	private String messageSuccess;
	
	@Override
	public Response save(Requisitos requisito) {
		requisitosRepository.save(requisito);
		RequisitosResponse response = (RequisitosResponse) responseFactory.getResponse(ResponseEnum.REQUISITOS);
		response.setCodigo(CodeResponseDefine.success);
		response.setMensaje(messageSuccess);
		response.setRequisito(requisito);
		return response;
	}

	@Override
	public Response findByIdReq(Long id) throws Exception{
		Optional<Requisitos> requisito = requisitosRepository.findById(id);
		if(requisito.isPresent()){
			RequisitosResponse response = (RequisitosResponse) responseFactory.getResponse(ResponseEnum.REQUISITOS);
			response.setCodigo(CodeResponseDefine.success);
			response.setMensaje(messageSuccess);
			response.setRequisito(requisito.get());
			return response;
		}else {
			throw new Exception("ERROR NO EXISTE EL REQUISITOS");
		}
	}
}
