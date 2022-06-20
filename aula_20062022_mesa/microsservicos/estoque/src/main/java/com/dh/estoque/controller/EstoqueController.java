package com.dh.estoque.controller;

import com.dh.estoque.dto.EstoqueDTO;
import com.dh.estoque.entity.Estoque;
import com.dh.estoque.service.EstoqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/estoque")
public class EstoqueController {

    @Autowired
    private EstoqueService service;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody EstoqueDTO dto) {
        service.save(dto);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping("/{id}")
    public Optional<Estoque> findById(@PathVariable Long id) {
        return service.findById(id);
    }

}
