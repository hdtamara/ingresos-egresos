package co.gov.mintic.carte.ingresosegresos.controller;

import co.gov.mintic.carte.ingresosegresos.entity.Perfil;
import co.gov.mintic.carte.ingresosegresos.entity.Rol;
import co.gov.mintic.carte.ingresosegresos.entity.TipoDocumento;
import co.gov.mintic.carte.ingresosegresos.entity.Usuario;
import co.gov.mintic.carte.ingresosegresos.services.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UsuarioRestController {

    @Autowired
    private IUsuarioService usuarioService;
    @GetMapping("/usuario/{id}")
    public Usuario findById(@PathVariable int id){
        return  usuarioService.findById(id);
    }
    @GetMapping("/usuario")
    public List<Usuario> findAll(){
        return  usuarioService.findAll();
    }
}
