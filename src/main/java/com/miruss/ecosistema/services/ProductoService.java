package com.miruss.ecosistema.services;

import java.util.ArrayList;
import java.util.Optional;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.miruss.ecosistema.defines.CodeResponseDefine;
import com.miruss.ecosistema.dto.responses.Response;
import com.miruss.ecosistema.dto.responses.impl.ProductoResponse;
import com.miruss.ecosistema.enums.ResponseEnum;
import com.miruss.ecosistema.factorys.ResponseFactory;
import com.miruss.ecosistema.models.Producto;
import com.miruss.ecosistema.models.Startup;
import com.miruss.ecosistema.repositorys.ProductoRepository;

@Service
@Transactional
public class ProductoService implements ProductoServiceInterface{

	@Autowired
	ProductoRepository productoRepository;
	
	@Autowired
	ResponseFactory responseFactory;
	
	@Value("${message.success}")
	private String messageSuccess;
	
	@Override
	public Response save(Producto producto) throws Exception {	
		productoRepository.save(producto);
		ProductoResponse response = (ProductoResponse) responseFactory.getResponse(ResponseEnum.PRODUCTO);
		response.setCodigo(CodeResponseDefine.success);
		response.setMensaje(messageSuccess);
		response.setProducto(producto);
		return response;
	}

	@Override
	public Response findByNombre(String nombre) throws Exception {
		Producto producto = productoRepository.findByNombre(nombre);
		if(producto != null) {
			ProductoResponse response = (ProductoResponse) responseFactory.getResponse(ResponseEnum.PRODUCTO);
			response.setCodigo(CodeResponseDefine.success);
			response.setMensaje(messageSuccess);
			response.setProducto(producto);
			return response;
		}else {
			throw new Exception("ERROR NO EXISTE EL PRODUCTO");
		}
	}
	
	@Override
	public Response findByStartup(Startup startup) throws Exception {
		ArrayList<Producto> productos = (ArrayList<Producto>) productoRepository.findAllByStartupProd(startup);
		if(productos.size() > 0) {
			ProductoResponse response = (ProductoResponse) responseFactory.getResponse(ResponseEnum.PRODUCTO);
			response.setCodigo(CodeResponseDefine.success);
			response.setMensaje(messageSuccess);
			response.setProductos(productos);
			return response;
		}else {
			throw new Exception("NO SE ENCONTRARON PRODUCTOS");
		}
	}
	
	@Override
	public Response findAll() throws Exception {
		ArrayList<Producto> productos = (ArrayList<Producto>) productoRepository.findAll();
		if(productos.size() > 0) {
			ProductoResponse response = (ProductoResponse) responseFactory.getResponse(ResponseEnum.PRODUCTO);
			response.setCodigo(CodeResponseDefine.success);
			response.setMensaje(messageSuccess);
			response.setProductos(productos);
			return response;	
		} else {
			throw new Exception("ERROR NO EXISTEN PRODUCTOS");
		}
	}
	
	@Override
	public Response deleteByNombre(String nombre) {
		productoRepository.deleteByNombre(nombre);
		ProductoResponse response = (ProductoResponse) responseFactory.getResponse(ResponseEnum.PRODUCTO);
		response.setCodigo(CodeResponseDefine.success);
		response.setMensaje(messageSuccess);
		return response;
	}
	
	@Override
	public Response findById(Long id) throws Exception {
		Optional<Producto> producto = productoRepository.findById(id);
		if(producto.isPresent()) {
			ProductoResponse response = (ProductoResponse) responseFactory.getResponse(ResponseEnum.PRODUCTO);
			response.setCodigo(CodeResponseDefine.success);
			response.setMensaje(messageSuccess);
			response.setProducto(producto.get());
			return response;
		} else {
			throw new Exception("ERROR NO EXISTE EL PRODUCTO");
		}
	}

	@Override
	public Response deleteAll(ArrayList<Producto> productos) throws Exception {
		productoRepository.deleteAll(productos);
		ProductoResponse response = (ProductoResponse) responseFactory.getResponse(ResponseEnum.PRODUCTO);
		response.setCodigo(CodeResponseDefine.success);
		response.setMensaje(messageSuccess);
		return response;
	}
}
