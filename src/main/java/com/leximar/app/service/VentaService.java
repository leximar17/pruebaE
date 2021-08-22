package com.leximar.app.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.leximar.app.commons.CommonServiceImpl;
import com.leximar.app.model.Venta;

@Service
public class VentaService extends CommonServiceImpl<Venta, JpaRepository<Venta,Long>> implements IVentaService {

}
