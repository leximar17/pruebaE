package com.leximar.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leximar.app.model.Producto;

public interface IProductoRepository extends JpaRepository <Producto, Long>  {

}
