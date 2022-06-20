package com.dh.estoque.repository;

import com.dh.estoque.entity.Estoque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstoqueRepository extends JpaRepository <Estoque, Long> {
}
