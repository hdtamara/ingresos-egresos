package co.gov.mintic.carte.ingresosegresos.services;

import co.gov.mintic.carte.ingresosegresos.entities.TipoDocumento;
import co.gov.mintic.carte.ingresosegresos.entities.Usuario;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface IUsuarioService {
    public Usuario findById(int id);

    public List<Usuario> findAll();
    public Usuario createUsuario(Usuario usuario);
    public Usuario updateUsuario(int id, Usuario usuario);
    public  void  deleteUsuario(int id);

}
