package com.Mentoria.BRQ.APICapituraCanais1.dto;

import com.Mentoria.BRQ.APICapituraCanais1.modelo.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PagamentoDto {

    private  Long id;
    private BigDecimal valor;
    private String nome;
    private String numero;
    private String dia;
    private String expiracao;
    private String codigo;
    private Status status;
    private long formaDePagamento;

}
