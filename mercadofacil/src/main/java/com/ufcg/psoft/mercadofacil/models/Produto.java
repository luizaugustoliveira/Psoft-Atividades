package com.ufcg.psoft.mercadofacil.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Produto {

    private Long id;

    private String nome;

    private double preco;

    private String codigoBarra;

    private String fabricante;

}
