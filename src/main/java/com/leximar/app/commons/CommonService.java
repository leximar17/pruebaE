package com.leximar.app.commons;

import java.util.List;
import java.util.Optional;

public interface CommonService<E> {
		List<E> findAll();

		Optional<E> findById(Long id);

		E create(E e);

		E update(E e);

		void deleteById(Long id);
	
}
