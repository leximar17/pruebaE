package com.leximar.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leximar.app.model.Cliente;


public interface IClienteRepository extends JpaRepository<Cliente, Long> {

}
