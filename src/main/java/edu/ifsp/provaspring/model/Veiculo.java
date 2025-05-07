package edu.ifsp.provaspring.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "veiculo_id")
    private int id;

    private String placa;
    private String modelo;
    private String cor;

    @ManyToOne(targetEntity = Tipo.class)
    @JoinColumn(name = "tipo_id")
    private Tipo tipo_veiculo;
}
