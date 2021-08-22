package com.leximar.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leximar.app.commons.CommonController;
import com.leximar.app.commons.CommonService;
import com.leximar.app.model.Cliente;
import com.leximar.app.model.Detalle;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController extends CommonController<Cliente, CommonService<Cliente>> {
	
	

}
