package com.dh.estoque.service.impl;

import com.dh.estoque.dto.EstoqueDTO;
import com.dh.estoque.entity.Estoque;
import com.dh.estoque.repository.EstoqueRepository;
import com.dh.estoque.service.EstoqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EstoqueServiceImpl implements EstoqueService {

    @Autowired
    private EstoqueRepository repository;

    @Override
    public void save(EstoqueDTO dto) {
        Estoque estoque = new Estoque();
        estoque.setName(dto.getName());
        estoque.setPreco(dto.getPreco());
        estoque.setUrlStream(dto.getUrlStream());
        repository.save(estoque);
    }

    @Override
    public Optional<Estoque> findById(Long id) {
        return repository.findById(id);
    }

}
