package com.leximar.app.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.leximar.app.commons.CommonServiceImpl;
import com.leximar.app.model.Cliente;

@Service
public class ClienteService extends CommonServiceImpl<Cliente, JpaRepository<Cliente,Long>> implements IClienteService {

}
