package com.miruss.ecosistema.repositorys;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.miruss.ecosistema.models.Convocatoria;
import com.miruss.ecosistema.models.Startup;

public interface StartupRepository extends CrudRepository<Startup, Long>{
	public Startup findByNombre(String nombre);
	public void deleteByNombre(String nombre);
	public ArrayList<Convocatoria> findAllConvById(Long id);
}
