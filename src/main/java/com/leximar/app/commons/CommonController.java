package com.leximar.app.commons;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class CommonController<E, S extends CommonService<E>> {

	@Autowired
	protected S service;

	@GetMapping
	public ResponseEntity<List<?>> findAll() {
		return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> findById(@PathVariable Long id) {

		if (service.findById(id).isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		} else {
			return ResponseEntity.status(HttpStatus.OK).body(service.findById(id).get());
		}

	}

	@PostMapping
	public ResponseEntity<?> create(@Valid @RequestBody E e) {
		return ResponseEntity.status(HttpStatus.CREATED).body(service.create(e));
	}

	@PutMapping
	public ResponseEntity<?> update(@Valid @RequestBody E e) {
		if (service.findById((Long) e).isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		} else {
			return ResponseEntity.status(HttpStatus.OK).body(service.update(e));
		}

	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id) {
		if (service.findById(id).isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		} else {
			E eDB = service.findById(id).get();
			service.deleteById(id);
			return ResponseEntity.status(HttpStatus.OK).body(eDB);
		}

	}

}
