package com.miruss.ecosistema.repositorys;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import com.miruss.ecosistema.models.Producto;
import com.miruss.ecosistema.models.Startup;

public interface ProductoRepository extends CrudRepository<Producto, Long>{
	public Producto findByNombre(String nombre);
	public ArrayList<Producto> findAllByStartupProd(Startup startup);
	public void deleteByNombre(String nombre);
}
