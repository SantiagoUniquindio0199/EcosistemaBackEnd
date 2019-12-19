package com.miruss.ecosistema.services;

import java.time.LocalDate;
import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.miruss.ecosistema.defines.CodeResponseDefine;
import com.miruss.ecosistema.dto.responses.Response;
import com.miruss.ecosistema.dto.responses.impl.ConvocatoriaResponse;
import com.miruss.ecosistema.enums.ResponseEnum;
import com.miruss.ecosistema.factorys.ResponseFactory;
import com.miruss.ecosistema.models.Convocatoria;
import com.miruss.ecosistema.models.Entidad;
import com.miruss.ecosistema.repositorys.ConvocatoriaRepository;

@Service
@Transactional
public class ConvocatoriaService implements ConvocatoriaServiceInterface{
	
	@Autowired
	ConvocatoriaRepository convocatoriaRepository;
	
	@Autowired
	ResponseFactory responseFactory;
	
	@Value("${message.success}")
	private String messageSuccess;
	
	@Override
	public Response save(Convocatoria convocatoria) throws Exception {	
		convocatoriaRepository.save(convocatoria);
		ConvocatoriaResponse response = (ConvocatoriaResponse) responseFactory.getResponse(ResponseEnum.CONVOCATORIA);
		response.setCodigo(CodeResponseDefine.success);
		response.setMensaje(messageSuccess);
		response.setConvocatoria(convocatoria);
		return response;
	}

	@Override
	public Response findByNombre(String nombre) throws Exception {
		Convocatoria convocatoria = convocatoriaRepository.findByNombre(nombre);
		if(convocatoria != null) {
			ConvocatoriaResponse response = (ConvocatoriaResponse) responseFactory.getResponse(ResponseEnum.CONVOCATORIA);
			response.setCodigo(CodeResponseDefine.success);
			response.setMensaje(messageSuccess);
			response.setConvocatoria(convocatoria);
			return response;
		}else {
			throw new Exception("ERROR NO EXISTE LA CONVOCATORIA");
		}
	}
	
	@Override
	public Response findByEntidad(Entidad entidad) throws Exception {
		ArrayList<Convocatoria> convocatorias = (ArrayList<Convocatoria>) convocatoriaRepository.findAllByEntidadCon(entidad);
		if(convocatorias.size() > 0) {
			ConvocatoriaResponse response = (ConvocatoriaResponse) responseFactory.getResponse(ResponseEnum.CONVOCATORIA);
			response.setCodigo(CodeResponseDefine.success);
			response.setMensaje(messageSuccess);
			response.setConvocatorias(convocatorias);
			return response;
		}else {
			throw new Exception("NO SE ENCONTRARON CONVOCATORIAS");
		}
	}
	
	@Override
	public Response deleteByNombre(String nombre) throws Exception {
		convocatoriaRepository.deleteByNombre(nombre);
		ConvocatoriaResponse response = (ConvocatoriaResponse) responseFactory.getResponse(ResponseEnum.CONVOCATORIA);
		response.setCodigo(CodeResponseDefine.success);
		response.setMensaje(messageSuccess);
		return response;
	}
	
	@Override
	public Response findAll() throws Exception {
		ArrayList<Convocatoria> convocatorias = (ArrayList<Convocatoria>) convocatoriaRepository.findAll();
		if(convocatorias.size() > 0) {
			ConvocatoriaResponse response = (ConvocatoriaResponse) responseFactory.getResponse(ResponseEnum.CONVOCATORIA);
			response.setCodigo(CodeResponseDefine.success);
			response.setMensaje(messageSuccess);
			response.setConvocatorias(convocatorias);
			return response;
		}else {
			throw new Exception("ERROR NO EXISTEN CONVOCATORIAS");
		}
	}
	
	@Override
	@Scheduled(cron = "0 0 0 * * ?")
	public void cerrarConvocatoria() {
		try {
			LocalDate fecha = LocalDate.now();
			String fechaActual = fecha.getYear() + "-" + (fecha.getMonthValue()) +"-" + fecha.getDayOfMonth();
			ArrayList<Convocatoria> convocatorias = (ArrayList<Convocatoria>) convocatoriaRepository.findAll();
			if(convocatorias.size() != 0) {
				for (int i = 0; i < convocatorias.size(); i++) {
					if(convocatorias.get(i).getEstado() == "Abierta") {
						if(mirarFecha(fechaActual, convocatorias.get(i).getCierre())) {
							convocatorias.get(i).setEstado("Cerrada");
							convocatoriaRepository.save(convocatorias.get(i));
						}
					}
				}
			}
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public boolean mirarFecha(String actual, String cierre) {
		if (Integer.parseInt(actual.substring(0, 4)) > Integer.parseInt(cierre.substring(0, 4))) {
			return true;
		} else if (Integer.parseInt(actual.substring(0, 4)) == Integer.parseInt(cierre.substring(0, 4))) {
			if (Integer.parseInt(actual.substring(5, 7)) > Integer.parseInt(cierre.substring(5, 7))) {
				return true;
			} else if (Integer.parseInt(actual.substring(5, 7)) == Integer.parseInt(cierre.substring(5, 7))) {
				if (Integer.parseInt(actual.substring(8)) > Integer.parseInt(cierre.substring(8))) {
					return true;
				}
			}
		}
		return false;
	}

}
