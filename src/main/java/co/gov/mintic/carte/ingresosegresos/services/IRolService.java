package co.gov.mintic.carte.ingresosegresos.services;

import co.gov.mintic.carte.ingresosegresos.entity.Rol;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
public interface IRolService {
    public Rol findById(int id);
    public List<Rol> findAll();
    public Rol createRol(Rol rol);
    public Rol updateRol(int id, Rol rol);
    public  void  deleteRol(int id);

}
