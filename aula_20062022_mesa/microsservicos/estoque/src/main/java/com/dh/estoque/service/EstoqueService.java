package com.dh.estoque.service;

import com.dh.estoque.dto.EstoqueDTO;
import com.dh.estoque.entity.Estoque;

import java.util.Optional;

public interface EstoqueService {
    void save(EstoqueDTO dto);
    Optional<Estoque> findById(Long id);
}
