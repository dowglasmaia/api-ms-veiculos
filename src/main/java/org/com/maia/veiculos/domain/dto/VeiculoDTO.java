package org.com.maia.veiculos.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class VeiculoDTO {

    @NotEmpty
    private String SKU;
    @NotEmpty(message = "Informe uma descrição para o Veículo")
    private String descricao;
    @NotEmpty
    private String anoFabricacao;
    @NotEmpty
    private String anoModelo;
    @NotEmpty
    private String modelo;
    private String cor;
    private String fabricante;


}
