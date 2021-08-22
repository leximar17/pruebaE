package com.leximar.app.commons;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public class CommonServiceImpl<E, R extends JpaRepository<E, Long>> implements CommonService<E> {

	@Autowired
	R repository;

	@Override
	public List<E> findAll() {
		return repository.findAll();
	}

	@Override
	public Optional<E> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public E create(E e) {
		return repository.save(e);
	}

	@Override
	public E update(E e) {
		return repository.save(e);
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
	}

}
