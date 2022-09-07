package co.gov.mintic.carte.ingresosegresos.controller;

import co.gov.mintic.carte.ingresosegresos.entities.Usuario;
import co.gov.mintic.carte.ingresosegresos.services.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("/usuario")
    public Usuario createUsuario(@RequestBody Usuario usuario) {
        return usuarioService.createUsuario(usuario);
    }
    @PutMapping("/usuario/{id}")
    public Usuario updateUsuario(@PathVariable int id, Usuario usuario) {
        return usuarioService.updateUsuario(id, usuario);
    }
    @DeleteMapping("/Usuario/{id}")
    public void deleteUsuario(int id) {
        usuarioService.deleteUsuario(id);
    }
}
