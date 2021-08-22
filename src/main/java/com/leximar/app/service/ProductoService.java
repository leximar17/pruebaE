package com.leximar.app.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leximar.app.commons.CommonServiceImpl;
import com.leximar.app.model.Producto;

public class ProductoService extends CommonServiceImpl <Producto , JpaRepository <Producto,Long>> implements IProductoService {

}
