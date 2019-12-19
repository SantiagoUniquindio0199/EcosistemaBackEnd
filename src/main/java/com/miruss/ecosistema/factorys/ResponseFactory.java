package com.miruss.ecosistema.factorys;

import org.springframework.stereotype.Component;

import com.miruss.ecosistema.dto.responses.Response;
import com.miruss.ecosistema.dto.responses.impl.AdmResponse;
import com.miruss.ecosistema.dto.responses.impl.Convocatoria_StartupResponse;
import com.miruss.ecosistema.dto.responses.impl.ConvocatoriaResponse;
import com.miruss.ecosistema.dto.responses.impl.EntidadResponse;
import com.miruss.ecosistema.dto.responses.impl.ProductoResponse;
import com.miruss.ecosistema.dto.responses.impl.RequisitosResponse;
import com.miruss.ecosistema.dto.responses.impl.StartupResponse;
import com.miruss.ecosistema.enums.ResponseEnum;

@Component
public class ResponseFactory {
	public Response getResponse(ResponseEnum tipo) {
		switch (tipo) {
		case STARTUP:
			return new StartupResponse();
		case PRODUCTO:
			return new ProductoResponse();
		case ENTIDAD:
			return new EntidadResponse();
		case ADM:
			return new AdmResponse();
		case CONVOCATORIA:
			return new ConvocatoriaResponse();
		case REQUISITOS:
			return new RequisitosResponse();
		case CONVOCATORIA_STARTUP:
			return new Convocatoria_StartupResponse();
		default:
			return null;
		}
	}
	
}
