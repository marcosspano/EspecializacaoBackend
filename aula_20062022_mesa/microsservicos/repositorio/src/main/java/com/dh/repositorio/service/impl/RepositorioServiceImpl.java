package com.dh.repositorio.service.impl;

import com.dh.repositorio.service.EstoqueFeign;
import com.dh.repositorio.service.RepositorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RepositorioServiceImpl implements RepositorioService {

    @Autowired
    private EstoqueFeign estoque;

    @Override
    public Object findEstoque(String preco) {
        return estoque.findEstoque(preco);
    }

}
