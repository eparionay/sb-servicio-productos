package com.servicio.epy.productos.models.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.servicio.epy.productos.models.entity.Productos;

@Repository
public interface ProductoDao extends CrudRepository<Productos, Long> {

}
