package org.com.maia.veiculos.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Builder
@AllArgsConstructor
@Entity
public class Veiculo {

    @Id
    @Column(unique = true)
    private String UUID;
    @Column(unique = true)
    private String SKU;
    private String descricao;
    private String anoFabricacao;
    private String anoModelo;
    private String modelo;
    private String cor;
    private String fabricante;

    public Veiculo() {
        this.UUID = java.util.UUID.randomUUID().toString();
    }


}
