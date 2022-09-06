package co.gov.mintic.carte.ingresosegresos.services;

import co.gov.mintic.carte.ingresosegresos.entity.Perfil;
import co.gov.mintic.carte.ingresosegresos.entity.Rol;
import co.gov.mintic.carte.ingresosegresos.entity.TipoDocumento;
import co.gov.mintic.carte.ingresosegresos.entity.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService implements  IUsuarioService{

    @Override
    public Usuario findById(int id) {
        Usuario usuario = new Usuario();
        usuario.setIdUsuario(id);
        usuario.setNombre("Hernan");
        usuario.setApellido("Rodriguez");
        usuario.setCedula("123456789");
        usuario.setPassword("1234");
        usuario.setUsuario("Hrodriguez");
        usuario.setEstado(true);
        usuario.setCorreo("bbbbb@bbbb.com");
        Perfil perfil = Perfil.Financiera;
        usuario.setPerfil(perfil);
        Rol rol = new Rol();
        rol.setIdRol(1);
        rol.setDescripcion("Admin");
        rol.setEstado(true);
        usuario.setRol(rol);
        TipoDocumento tipoDocumento = new TipoDocumento();
        tipoDocumento.setIdTipoDocumento(1);
        tipoDocumento.setDescripcion("Cedula de ciudadania");
        tipoDocumento.setSiglas("CC");
        tipoDocumento.setEstado(true);
        usuario.setTipoDocumento(tipoDocumento);
        return usuario;
    }

    @Override
    public List<Usuario> findAll() {
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario1 = new Usuario();
        usuario1.setIdUsuario(1);
        usuario1.setNombre("Hernan");
        usuario1.setApellido("Rodriguez");
        usuario1.setCedula("123456789");
        usuario1.setPassword("1234");
        usuario1.setUsuario("Hrodriguez");
        usuario1.setEstado(true);
        usuario1.setCorreo("bbbbb@bbbb.com");
        Perfil perfil1 = Perfil.Financiera;
        usuario1.setPerfil(perfil1);
        Rol rol1 = new Rol();
        rol1.setIdRol(1);
        rol1.setDescripcion("Admin");
        rol1.setEstado(true);
        usuario1.setRol(rol1);
        TipoDocumento tipoDocumento1 = new TipoDocumento();
        tipoDocumento1.setIdTipoDocumento(1);
        tipoDocumento1.setDescripcion("Cedula de ciudadania");
        tipoDocumento1.setSiglas("CC");
        tipoDocumento1.setEstado(true);
        usuario1.setTipoDocumento(tipoDocumento1);
        usuarios.add(usuario1);

        Usuario usuario2 = new Usuario();
        usuario2.setIdUsuario(1);
        usuario2.setNombre("Hernan");
        usuario2.setApellido("Rodriguez");
        usuario2.setCedula("123456789");
        usuario2.setPassword("1234");
        usuario2.setUsuario("Hrodriguez");
        usuario2.setEstado(true);
        usuario2.setCorreo("bbbbb@bbbb.com");
        Perfil perfil2 = Perfil.Financiera;
        usuario1.setPerfil(perfil2);
        Rol rol2 = new Rol();
        rol2.setIdRol(2);
        rol2.setDescripcion("Admin");
        rol2.setEstado(true);
        usuario2.setRol(rol2);
        TipoDocumento tipoDocumento2 = new TipoDocumento();
        tipoDocumento2.setIdTipoDocumento(2);
        tipoDocumento2.setDescripcion("Cedula de Extrangeria");
        tipoDocumento2.setSiglas("CC");
        tipoDocumento2.setEstado(true);
        usuario1.setTipoDocumento(tipoDocumento2);
        usuarios.add(usuario2);
        return usuarios;
    }
}
