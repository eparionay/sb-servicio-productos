package com.servicio.epy.productos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.servicio.epy.productos.models.service.IProductoService;
import com.servicio.epy.productos.models.entity.Productos;


@RestController
@RequestMapping("/productos")
public class ProductoController {

	@Autowired
	private IProductoService productoService;
	
	@GetMapping("/listar")
	public List<Productos> listar(){
		return productoService.findAll();
	}
	
	@GetMapping("/ver/{id}")
	public Productos ver(@PathVariable Long id) {
		return productoService.findById(id);
	}
	
	
	
	
	
	
}
