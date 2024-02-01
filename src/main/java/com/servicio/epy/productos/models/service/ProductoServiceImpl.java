package com.servicio.epy.productos.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.servicio.epy.productos.models.dao.ProductoDao;
import com.servicio.epy.productos.models.entity.Productos;


@Service
public class ProductoServiceImpl implements IProductoService {

	@Autowired
	private ProductoDao productoRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Productos> findAll() {
		return (List<Productos>) productoRepository.findAll();
	}

	
	@Override
	public Productos findById(Long id) {
		return productoRepository.findById(id).orElse(null);
	}

}
