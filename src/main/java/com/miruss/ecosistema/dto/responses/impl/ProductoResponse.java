package com.miruss.ecosistema.dto.responses.impl;

import java.util.ArrayList;

import com.miruss.ecosistema.dto.responses.Response;
import com.miruss.ecosistema.models.Producto;

public class ProductoResponse extends Response{
	
	private Producto producto;
	
	private ArrayList<Producto> productos;
	
	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

}
