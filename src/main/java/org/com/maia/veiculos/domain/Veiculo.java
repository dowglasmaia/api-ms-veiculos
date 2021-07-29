package org.com.maia.veiculos.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@Builder
@AllArgsConstructor
@Entity
public class Veiculo {

    @Id
    private String UUID;
    private String SKU;

    @NotEmpty(message = "Informe uma descrição para o Veículo")
    private String descricao;
    private String anoFabricacao;
    private String anoModelo;
    private String modelo;
    private String fabricante;

    public Veiculo() {
        this.UUID = java.util.UUID.randomUUID().toString();
    }
}
