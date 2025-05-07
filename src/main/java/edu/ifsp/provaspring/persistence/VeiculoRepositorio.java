package edu.ifsp.provaspring.persistence;

import edu.ifsp.provaspring.model.Veiculo;
import org.springframework.data.repository.CrudRepository;

public interface VeiculoRepositorio extends CrudRepository<Veiculo, Integer> {
}
