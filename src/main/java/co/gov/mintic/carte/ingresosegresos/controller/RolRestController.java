package co.gov.mintic.carte.ingresosegresos.controller;

import co.gov.mintic.carte.ingresosegresos.entity.Rol;
import co.gov.mintic.carte.ingresosegresos.services.IRolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class RolRestController {

    @Autowired
    private IRolService rolService;

    @GetMapping("/rol/{id}")
    public Rol findById(@PathVariable int id){
        return rolService.findById(id);
    }

    @GetMapping("/rol")
    public List<Rol> findAll(){
        return  rolService.findAll();
    }

    @PostMapping("/rol")
    public Rol createRol(@PathVariable Rol rol){
        return  rolService.createRol(rol);
    }

    @PutMapping("/rol/{id}")
    public Rol updateRol(@PathVariable int id, @RequestBody Rol rol){
        return  rolService.updateRol(id,rol);
    }

    @DeleteMapping("/rol/{id}")
    public  void  deleteRol(@PathVariable int id){
        rolService.deleteRol(id);
    }

}
