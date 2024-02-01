package com.servicio.epy.productos.models.service;


import java.util.List;

import com.servicio.epy.productos.models.entity.*;
public interface IProductoService {
	
	public List<Productos> findAll();
	public Productos findById(Long id);
	

}
