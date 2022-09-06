package co.gov.mintic.carte.ingresosegresos.services;

import co.gov.mintic.carte.ingresosegresos.entity.TipoDocumento;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class TipoDocumentoService implements  ITipoDocumentoService{
    @Override
    public TipoDocumento findById(int id) {
        TipoDocumento tipoDocumento = new TipoDocumento();
        tipoDocumento.setIdTipoDocumento(id);
        tipoDocumento.setDescripcion("Admin");
        tipoDocumento.setEstado(true);
        return tipoDocumento;
    }

    @Override
    public List<TipoDocumento> findAll() {
        List<TipoDocumento> tipoDocumentos = new ArrayList<TipoDocumento>();
        TipoDocumento tipoDocumento1 = new TipoDocumento();
        tipoDocumento1.setIdTipoDocumento(1);
        tipoDocumento1.setDescripcion("Admin");
        tipoDocumento1.setEstado(true);
        tipoDocumentos.add(tipoDocumento1);
        TipoDocumento tipoDocumento2 = new TipoDocumento();
        tipoDocumento2.setIdTipoDocumento(2);
        tipoDocumento2.setDescripcion("User");
        tipoDocumento2.setEstado(true);
        tipoDocumentos.add(tipoDocumento2);
        return tipoDocumentos;
    }

    @Override
    public TipoDocumento createTipoDocumento(TipoDocumento tipoDocumento) {
        TipoDocumento newTipoDocumento = new TipoDocumento();
        newTipoDocumento.setIdTipoDocumento(tipoDocumento.getIdTipoDocumento());
        newTipoDocumento.setDescripcion(tipoDocumento.getDescripcion());
        newTipoDocumento.setEstado(tipoDocumento.isEstado());
        return newTipoDocumento;
    }

    @Override
    public TipoDocumento updateTipoDocumento(int id, TipoDocumento tipoDocumento) {
        TipoDocumento putTipoDocumento = findById(id);
        putTipoDocumento.setDescripcion("Admin");
        putTipoDocumento.setEstado(true);
        return putTipoDocumento;
    }

    @Override
    public void deleteRol(int id) {
        TipoDocumento deleteRol = findById(id);
    }
}
