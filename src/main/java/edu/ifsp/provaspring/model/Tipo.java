package edu.ifsp.provaspring.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Tipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String tipo;
    private int quantidade_vagas;
    private Double preco_hora;

    @OneToMany(targetEntity = Veiculo.class)
    @JoinColumn(name = "id")
    private List<Veiculo> veiculos;
}
