package co.gov.mintic.carte.ingresosegresos.repository;

import co.gov.mintic.carte.ingresosegresos.entities.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioRepository extends CrudRepository<Usuario, Long> {
}
