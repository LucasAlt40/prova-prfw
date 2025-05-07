package edu.ifsp.provaspring.persistence;

import edu.ifsp.provaspring.model.Tipo;
import org.springframework.data.repository.CrudRepository;

public interface TipoRepositorio extends CrudRepository<Tipo, Integer> {
}
