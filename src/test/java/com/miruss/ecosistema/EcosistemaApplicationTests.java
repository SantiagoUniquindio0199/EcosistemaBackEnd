package com.miruss.ecosistema;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.miruss.ecosistema.models.Adm;
import com.miruss.ecosistema.models.Entidad;
import com.miruss.ecosistema.models.Producto;
import com.miruss.ecosistema.models.Startup;
import com.miruss.ecosistema.repositorys.AdmRepository;
import com.miruss.ecosistema.repositorys.ConvocatoriaRepository;
import com.miruss.ecosistema.repositorys.EntidadRepository;
import com.miruss.ecosistema.repositorys.ProductoRepository;
import com.miruss.ecosistema.repositorys.StartupRepository;

import junit.framework.TestCase;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EcosistemaApplicationTests extends TestCase {

	@Autowired
	AdmRepository admRepository;
	
	@Autowired
	StartupRepository startupRepository;
	
	@Autowired
	EntidadRepository entidadRepository;
	
	@Autowired
	ConvocatoriaRepository convocatoriaRepository;
	
	@Autowired
	ProductoRepository productoRepository;
	
	@Test
	public void testCrudAdmin() {
		Adm admin;
		Long idAdm;
		Optional<Adm> admCrud;
		try {
			admin = new Adm();
			System.out.println("PRUEBA UNITARIA ADMIN");
			admin.setCon("01santiagoperdomo99@gmail.com");
			admin.setCor("123fenix");
			admRepository.save(admin);
			System.out.println("ADMIN CREADO");
			idAdm = admin.getId();
			admCrud = admRepository.findById(idAdm);
			if (admCrud.isPresent()) {
				System.out.println("ADMIN OBTENIDO");
				System.out.println("CORREO admin: " + admCrud.get().getCon());

				System.out.println("ADMIN ACTUALIZADO");
				admCrud.get().setCon("Nuevo correo admin prueba unitaria");
				admRepository.save(admCrud.get());
				System.out.println("CORREO admin: " + admCrud.get().getCon());

				admRepository.delete(admCrud.get());
				System.out.println("ADMIN ELIMINADO");
			}
			Iterable<Adm> lista = admRepository.findAll();
			lista.forEach(dato -> System.out.println(dato.getCon()));
			assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			assertTrue(false);
		}
	}
	
	@Test
	public void testCrudStartup() {
		Startup startup;
		Long idStartup;
		Optional<Startup> startupCrud;
		try {
			startup = new Startup();
			System.out.println("PRUEBA UNITARIA STARTUP");
			startup.setNombre("Rappi");
			startup.setSector("Teconologia");
			startup.setContrasena("123fenix");
			startup.setIntension("Crecer a nivel nacional");
			startupRepository.save(startup);
			System.out.println("STARTUP CREADA");
			idStartup = startup.getId();
			startupCrud = startupRepository.findById(idStartup);
			if (startupCrud.isPresent()) {
				System.out.println("STARTUP OBTENIDA");
				System.out.println("CORREO admin: " + startupCrud.get().getNombre());

				System.out.println("STARTUP ACTUALIZADA");
				startupCrud.get().setNombre("Nuevo nombre startup prueba unitaria");
				startupRepository.save(startupCrud.get());
				System.out.println("NOMBRE startup: " + startupCrud.get().getNombre());

				startupRepository.delete(startupCrud.get());
				System.out.println("STARTUP ELIMINADA");
			}
			Iterable<Startup> lista = startupRepository.findAll();
			lista.forEach(dato -> System.out.println(dato.getNombre()));
			assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			assertTrue(false);
		}
	}
	
	@Test
	public void testCrudEntidad() {
		Entidad entidad;
		Long idEntidad;
		Optional<Entidad> entidadCrud;
		try {
			entidad = new Entidad();
			System.out.println("PRUEBA UNITARIA ENTIDAD");
			entidad.setNombre("Empresas Publicas De Armenia");
			entidad.setDescripcion("Entidad del gobierno");
			entidad.setContrasena("123fenix");
			entidadRepository.save(entidad);
			System.out.println("ENTIDAD CREADA");
			idEntidad = entidad.getId();
			entidadCrud = entidadRepository.findById(idEntidad);
			if (entidadCrud.isPresent()) {
				System.out.println("ENTIDAD OBTENIDA");
				System.out.println("CORREO entidad: " + entidadCrud.get().getNombre());

				System.out.println("ENTIDAD ACTUALIZADA");
				entidadCrud.get().setNombre("Nuevo nombre entidad prueba unitaria");
				entidadRepository.save(entidadCrud.get());
				System.out.println("CORREO admin: " + entidadCrud.get().getNombre());

				entidadRepository.delete(entidadCrud.get());
				System.out.println("ENTIDAD ELIMINADA");
			}
			Iterable<Entidad> lista = entidadRepository.findAll();
			lista.forEach(dato -> System.out.println(dato.getNombre()));
			assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			assertTrue(false);
		}
	}
	
	@Test
	public void testCrudProducto() {
		Producto producto;
		Long idProducto;
		Optional<Producto> productoCrud;
		try {
			System.out.println("PRUEBA UNITARIA PRODUCTO");
			Startup startup = new Startup();
			startup.setNombre("TePago");
			startup.setSector("Teconologia");
			startup.setContrasena("123fenix");
			startup.setIntension("Crecer a nivel nacional");
			producto = new Producto();
			System.out.println("PRODUCTO CREADO");
			producto.setNombre("Computador");
			producto.setStartupProd(startup);
			startupRepository.save(startup);
			productoRepository.save(producto);
			idProducto= producto.getId();
			productoCrud = productoRepository.findById(idProducto);
			if (productoCrud.isPresent()) {
				System.out.println("PRODUCTO OBTENIDO");
				System.out.println("CORREO Producto: " + productoCrud.get().getNombre());

				System.out.println("PRODUCTO ACTUALIZADO");
				productoCrud.get().setNombre("Nuevo nombre producto prueba unitaria");
				productoRepository.save(productoCrud.get());
				System.out.println("NOMBRE producto: " + productoCrud.get().getNombre());

				productoRepository.delete(productoCrud.get());
				startupRepository.delete(startup);
				System.out.println("PRODUCTO ELIMINADO");
			}
			Iterable<Producto> lista = productoRepository.findAll();
			lista.forEach(dato -> System.out.println(dato.getNombre()));
			assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			assertTrue(false);
		}
	}
	
	/**@Test
	public void contextLoads() {
	}*/

}
