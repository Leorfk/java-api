package com.projetospring.apijava.service;

import com.projetospring.apijava.domain.Categoria;
import com.projetospring.apijava.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria buscar(Integer id){
        Optional<Categoria> categoria =  categoriaRepository.findById(id);
        return categoria.orElse(null);
    }
}