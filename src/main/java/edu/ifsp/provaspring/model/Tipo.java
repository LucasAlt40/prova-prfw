package edu.ifsp.provaspring.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@Entity()
@Table(name = "tipo_veiculos")
public class Tipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tipo_id")
    private int id;

    private String tipo;
    private int quantidade_vagas;
    private Double preco_hora;

    @OneToMany(targetEntity = Veiculo.class)
    @JoinColumn(name = "veiculo_id")
    private List<Veiculo> veiculos;
}
