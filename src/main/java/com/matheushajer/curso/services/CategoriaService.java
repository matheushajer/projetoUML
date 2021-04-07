package com.matheushajer.curso.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matheushajer.curso.domain.Categoria;
import com.matheushajer.curso.repositories.CategoriaRepository;
import com.matheushajer.curso.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar( Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
					"Objeto não encontrado! ID: " +id +", Tipo: " +Categoria.class.getName()));
				
	}
	
}
