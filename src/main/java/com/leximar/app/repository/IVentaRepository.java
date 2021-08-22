package com.leximar.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leximar.app.model.Venta;

public interface IVentaRepository extends JpaRepository<Venta, Long> {

}
