package com.corenetworks.RelacionNM.servicio;

import com.corenetworks.RelacionNM.modelo.Lugar;
import com.corenetworks.RelacionNM.repositorio.ILugarRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LugarServicioImpl implements ILugarServicio{
    @Autowired
    private ILugarRepositorio lugarRepositorio;
    @Override
    public Lugar insertar(Lugar l) {
        return lugarRepositorio.save(l);
    }

    @Override
    public Lugar modificar(Lugar l) {
        return lugarRepositorio.save(l);
    }

    @Override
    public void eliminar(int idLugar) {
        lugarRepositorio.deleteById(idLugar);
    }

    @Override
    public List<Lugar> obtenerTodos() {
        return lugarRepositorio.findAll();
    }

    @Override
    public Lugar obtenerUno(int idLugar) {
        return lugarRepositorio.findById(idLugar).orElse(new Lugar());
    }
}
