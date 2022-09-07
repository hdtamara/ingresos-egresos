package co.gov.mintic.carte.ingresosegresos.services;

import co.gov.mintic.carte.ingresosegresos.entities.TipoDocumento;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface ITipoDocumentoService {

    public TipoDocumento findById(int id);


    public List<TipoDocumento> findAll();


    public TipoDocumento createTipoDocumento(TipoDocumento tipoDocumento);

    public TipoDocumento updateTipoDocumento(int id, TipoDocumento tipoDocumento);

    public  void  deleteRol(int id);
}
