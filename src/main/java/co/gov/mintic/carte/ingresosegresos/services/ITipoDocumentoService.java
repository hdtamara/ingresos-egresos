package co.gov.mintic.carte.ingresosegresos.services;

import co.gov.mintic.carte.ingresosegresos.entity.TipoDocumento;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

public interface ITipoDocumentoService {

    public TipoDocumento findById(int id);


    public List<TipoDocumento> findAll();


    public TipoDocumento createTipoDocumento(TipoDocumento tipoDocumento);

    @PutMapping("/tipoDocumento/{id}")
    public TipoDocumento updateTipoDocumento(int id, TipoDocumento tipoDocumento);


    @DeleteMapping("/tipoDocumento/{id}")
    public  void  deleteRol(int id);
}
