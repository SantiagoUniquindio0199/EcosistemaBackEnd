package com.miruss.ecosistema.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.miruss.ecosistema.defines.CodeResponseDefine;
import com.miruss.ecosistema.dto.responses.Response;
import com.miruss.ecosistema.dto.responses.impl.ProductoResponse;
import com.miruss.ecosistema.enums.ResponseEnum;
import com.miruss.ecosistema.factorys.ResponseFactory;
import com.miruss.ecosistema.models.Producto;
import com.miruss.ecosistema.models.Startup;
import com.miruss.ecosistema.services.ProductoService;

@RestController
@RequestMapping("/producto")
public class ProductoController {
	
	@Autowired
	ProductoService productoService;
	
	@Autowired
	ResponseFactory responseFactory;
	
	@Value("${message.error}")
	private String messageError;
	
	@CrossOrigin(origins = "https://ecosistema-frontend.herokuapp.com")
	@RequestMapping(value = "/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Response saveProducto(@RequestBody Producto producto) {
		try {
			return productoService.save(producto);
		}catch (Exception e) {
			ProductoResponse response = (ProductoResponse) responseFactory.getResponse(ResponseEnum.PRODUCTO);
			response.setCodigo(CodeResponseDefine.error);
			response.setMensaje(messageError);
			return response;
		}
	}
	
	@CrossOrigin(origins = "https://ecosistema-frontend.herokuapp.com")
	@RequestMapping(value = "/delete/{nombre}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Response deleteProducto(@PathVariable("nombre") String nombre) {
		try {
			return productoService.deleteByNombre(nombre);
		}catch (Exception e) {
			ProductoResponse response = (ProductoResponse) responseFactory.getResponse(ResponseEnum.PRODUCTO);
			response.setCodigo(CodeResponseDefine.error);
			response.setMensaje(messageError);
			return response;
		}
	}
	
	@CrossOrigin(origins = "https://ecosistema-frontend.herokuapp.com")
	@RequestMapping(value = "/todos", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Response findAllProductos() {
		try {
			return productoService.findAll();
		}catch (Exception e) {
			ProductoResponse response = (ProductoResponse) responseFactory.getResponse(ResponseEnum.PRODUCTO);
			response.setCodigo(CodeResponseDefine.error);
			response.setMensaje(messageError);
			return response;
		}
	}
	
	@CrossOrigin(origins = "https://ecosistema-frontend.herokuapp.com")
	@RequestMapping(value = "/nombre/{nombre}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Response findByNombreProducto(@PathVariable("nombre") String nombre) {
		try {
			return productoService.findByNombre(nombre);
		}catch (Exception e) {
			ProductoResponse response = (ProductoResponse) responseFactory.getResponse(ResponseEnum.PRODUCTO);
			response.setCodigo(CodeResponseDefine.error);
			response.setMensaje(messageError);
			return response;
		}
	}
	
	@CrossOrigin(origins = "https://ecosistema-frontend.herokuapp.com")
	@RequestMapping(value = "/startup/{startup}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Response findByStartupProducto(@PathVariable("startup") Startup startup) {
		try {
			return productoService.findByStartup(startup);
		}catch (Exception e) {
			ProductoResponse response = (ProductoResponse) responseFactory.getResponse(ResponseEnum.PRODUCTO);
			response.setCodigo(CodeResponseDefine.error);
			response.setMensaje(messageError);
			return response;
		}
	}
	
	@CrossOrigin(origins = "https://ecosistema-frontend.herokuapp.com")
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Response findByIdProducto(@PathVariable("id") Long id) {
		try {
			return productoService.findById(id);
		}catch (Exception e) {
			ProductoResponse response = (ProductoResponse) responseFactory.getResponse(ResponseEnum.PRODUCTO);
			response.setCodigo(CodeResponseDefine.error);
			response.setMensaje(messageError);
			return response;
		}
	}
	
	@CrossOrigin(origins = "https://ecosistema-frontend.herokuapp.com")
	@RequestMapping(value = "/delete/todos/{productos}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Response findByIdProducto(@PathVariable("productos") ArrayList<Producto> productos) {
		try {
			return productoService.deleteAll(productos);
		}catch (Exception e) {
			ProductoResponse response = (ProductoResponse) responseFactory.getResponse(ResponseEnum.PRODUCTO);
			response.setCodigo(CodeResponseDefine.error);
			response.setMensaje(messageError);
			return response;
		}
	}
	
}
