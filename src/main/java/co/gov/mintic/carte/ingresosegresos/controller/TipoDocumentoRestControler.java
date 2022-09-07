package co.gov.mintic.carte.ingresosegresos.controller;

import co.gov.mintic.carte.ingresosegresos.entities.TipoDocumento;
import co.gov.mintic.carte.ingresosegresos.services.ITipoDocumentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
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
    public TipoDocumento createTipoDocumento(@RequestBody TipoDocumento tipoDocumento){
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

