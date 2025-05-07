package edu.ifsp.provaspring.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String placa;
    private String modelo;
    private String cor;

    @ManyToOne(targetEntity = Tipo.class)
    @JoinColumn(name = "id")
    private Tipo tipo_veiculo;
}
