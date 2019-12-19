package com.miruss.ecosistema.repositorys;

import org.springframework.data.repository.CrudRepository;

import com.miruss.ecosistema.models.Entidad;

public interface EntidadRepository extends CrudRepository<Entidad, Long>{
	public Entidad findByNombre(String nombre);
	public void deleteByNombre(String nombre);
}
