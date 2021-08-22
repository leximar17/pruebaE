package com.leximar.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.leximar.app.commons.CommonServiceImpl;
import com.leximar.app.model.Detalle;

@Service
public class DetalleService extends CommonServiceImpl<Detalle, JpaRepository<Detalle,Long>> implements IDetalleService{
	
	

}
