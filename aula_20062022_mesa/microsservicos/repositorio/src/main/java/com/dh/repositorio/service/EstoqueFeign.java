package com.dh.repositorio.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "ESTOQUE-SERVICE")
public interface EstoqueFeign {

    @RequestMapping(method = RequestMethod.GET, value = "/estoque/{id}")
    Object findEstoque(@PathVariable String preco);

}
