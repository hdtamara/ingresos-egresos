package co.gov.mintic.carte.ingresosegresos.controller;

import co.gov.mintic.carte.ingresosegresos.entity.Rol;
import co.gov.mintic.carte.ingresosegresos.entity.TipoDocumento;
import co.gov.mintic.carte.ingresosegresos.services.ITipoDocumentoService;
import co.gov.mintic.carte.ingresosegresos.services.TipoDocumentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TipoDocumentoRestControler {
    @Autowired
    private ITipoDocumentoService tipoDocumentoService;

    @GetMapping("/tipoDocumento/{id}")
    public TipoDocumento findById(@PathVariable int id){
        return tipoDocumentoService.findById(id);
    }

    @GetMapping("/tipoDocumento")
    public List<TipoDocumento> findAll(){
        return  tipoDocumentoService.findAll();
    }

    @PostMapping("/tipoDocumento")
    public TipoDocumento createTipoDocumento(@PathVariable TipoDocumento tipoDocumento){
        return  tipoDocumentoService.createTipoDocumento(tipoDocumento);
    }

    @PutMapping("/tipoDocumento/{id}")
    public TipoDocumento updateTipoDocumento(@PathVariable int id, @RequestBody TipoDocumento tipoDocumento){
        return  tipoDocumentoService.updateTipoDocumento(id,tipoDocumento);
    }

    @DeleteMapping("/tipoDocumento/{id}")
    public  void  deleteRol(@PathVariable int id){
        tipoDocumentoService.deleteRol(id);
    }
}

