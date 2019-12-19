package com.miruss.ecosistema.repositorys;

import org.springframework.data.repository.CrudRepository;
import com.miruss.ecosistema.models.Adm;

public interface AdmRepository extends CrudRepository<Adm, Long>{
	public Adm findByCor(String cor);
	public void deleteByCor(String correo);
}
