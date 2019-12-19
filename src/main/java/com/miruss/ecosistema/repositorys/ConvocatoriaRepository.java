package com.miruss.ecosistema.repositorys;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.miruss.ecosistema.models.Convocatoria;
import com.miruss.ecosistema.models.Entidad;

public interface ConvocatoriaRepository extends CrudRepository<Convocatoria, Long>{
	public Convocatoria findByNombre(String nombre);
	public ArrayList<Convocatoria> findAllByEntidadCon(Entidad entidad);
	public void deleteByNombre(String nombre);
	
}
