package co.gov.mintic.carte.ingresosegresos.services;

import co.gov.mintic.carte.ingresosegresos.entities.Perfil;
import co.gov.mintic.carte.ingresosegresos.entities.Rol;
import co.gov.mintic.carte.ingresosegresos.entities.TipoDocumento;
import co.gov.mintic.carte.ingresosegresos.entities.Usuario;
import co.gov.mintic.carte.ingresosegresos.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService implements  IUsuarioService{
    @Autowired
    private IUsuarioRepository usuarioRepository;

    @Override
    public Usuario findById(int id) {
        Optional<Usuario> usuario = usuarioRepository.findById((long) id);
        return usuario.get();
    }

    @Override
    public List<Usuario> findAll() {
        List<Usuario> usuarios = (List<Usuario>) usuarioRepository.findAll();
        return usuarios;
    }

    @Override
    public Usuario createUsuario(Usuario usuario) {
        Usuario newUsuario = usuarioRepository.save(usuario);
        return newUsuario;
    }

    @Override
    public Usuario updateUsuario(int id, Usuario usuario) {
        Usuario putUsuario = usuarioRepository.save(usuario);
        return putUsuario;
    }

    @Override
    public void deleteUsuario(int id) {
        usuarioRepository.deleteById((long) id);
    }
}
