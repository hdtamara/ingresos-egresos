package co.gov.mintic.carte.ingresosegresos.services;

import co.gov.mintic.carte.ingresosegresos.entity.Usuario;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface IUsuarioService {
    public Usuario findById(int id);

    public List<Usuario> findAll();
}
