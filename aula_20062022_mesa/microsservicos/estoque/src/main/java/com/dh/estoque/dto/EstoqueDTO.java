package com.dh.estoque.dto;

import lombok.Data;

@Data
public class EstoqueDTO {
    private Long id;
    private String name;
    private String preco;
    private String urlStream;
}
