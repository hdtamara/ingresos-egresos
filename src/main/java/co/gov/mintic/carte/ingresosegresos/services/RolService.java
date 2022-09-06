package co.gov.mintic.carte.ingresosegresos.services;

import co.gov.mintic.carte.ingresosegresos.entity.Rol;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class RolService implements IRolService{

    @Override
    public Rol findById(int id) {
        Rol rol = new Rol();
        rol.setIdRol(id);
        rol.setDescripcion("Admin");
        rol.setEstado(true);
        return rol;
    }

    @Override
    public List<Rol> findAll() {
        List<Rol> roles = new ArrayList<Rol>();
        Rol rol1 = new Rol();
        rol1.setIdRol(1);
        rol1.setDescripcion("Admin");
        rol1.setEstado(true);
        roles.add(rol1);
        Rol rol2 = new Rol();
        rol2.setIdRol(2);
        rol2.setDescripcion("User");
        rol2.setEstado(true);
        roles.add(rol2);
        return roles;
    }

    @Override
    public Rol createRol(Rol rol) {
        Rol newRol = new Rol();
        rol.setIdRol(rol.getIdRol());
        rol.setDescripcion(rol.getDescripcion());
        rol.setEstado(rol.isEstado());
        return newRol;
    }

    @Override
    public Rol updateRol(int id, Rol rol) {
        Rol putRol = findById(id);
        putRol.setDescripcion("Admin");
        putRol.setEstado(true);
        return putRol;
    }

    @Override
    public void deleteRol(int id) {
        Rol deleteRol = findById(id);
    }
}
