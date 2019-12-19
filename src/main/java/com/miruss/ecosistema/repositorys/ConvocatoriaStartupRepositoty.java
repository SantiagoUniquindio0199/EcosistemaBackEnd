package com.miruss.ecosistema.repositorys;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.miruss.ecosistema.models.Convocatoria;
import com.miruss.ecosistema.models.Convocatoria_Startup;
import com.miruss.ecosistema.models.Startup;

public interface ConvocatoriaStartupRepositoty extends CrudRepository<Convocatoria_Startup, Long>{
	public ArrayList<Convocatoria_Startup> findAllByStartupApli(Startup startup);
	public ArrayList<Convocatoria_Startup> findAllByConvocatoriaApli(Convocatoria convocatoria);
	public Convocatoria_Startup findByStartupApliAndConvocatoriaApli(Startup startup, Convocatoria convocatoria);
	public void deleteByConvocatoriaApli(Convocatoria convocatoria);
	
}
