package com.leximar.app.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ventas")
public class Venta {
	
	//(id, fecha, iva, descuento, total)
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Date fecha;
	
	private Double iva;
	
	private Double descuento;
	
	private Double total;
	
	@OneToOne(cascade = CascadeType.ALL)
	//@JoinColumn (name ="venta_id", nullable = false)
	private Detalle detalle;

}
