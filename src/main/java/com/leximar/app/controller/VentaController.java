package com.leximar.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leximar.app.commons.CommonController;
import com.leximar.app.commons.CommonService;
import com.leximar.app.model.Venta;

@RestController
@RequestMapping("/api/ventas")
public class VentaController extends CommonController<Venta, CommonService<Venta>>{

}
