package com.dh.repositorio.controller;

import com.dh.repositorio.service.RepositorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/repositorio")
public class RepositorioController {

    @Autowired
    private RepositorioService service;

    @GetMapping("/{preco}")
    public Object findEstoque(@PathVariable String preco) {
        return service.findEstoque(preco);
    }

}
