package com.dh.estoque.entity;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "estoque")
@Data
public class Estoque {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;
        private String preco;
        private String urlStream;
}