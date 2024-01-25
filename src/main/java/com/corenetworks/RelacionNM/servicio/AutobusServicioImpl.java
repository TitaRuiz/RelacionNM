package com.corenetworks.RelacionNM.servicio;

import com.corenetworks.RelacionNM.modelo.Autobus;
import com.corenetworks.RelacionNM.repositorio.IAutobusRepositorio;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AutobusServicioImpl implements IAutobusServicio{
    @Autowired
    private IAutobusRepositorio repoAutobus;
    @Override
    public Autobus insertar(Autobus a) {
        return repoAutobus.save(a);
    }

    @Override
    public Autobus modificar(Autobus a) {
        return repoAutobus.save(a);
    }

    @Override
    public void eliminar(String matricula) {
       repoAutobus.deleteById(matricula);
    }

    @Override
    public List<Autobus> obtenerTodos() {
        return repoAutobus.findAll();
    }

    @Override
    public Autobus obtenerUno(String matricula) {
        return repoAutobus.findById(matricula).orElse(new Autobus());
    }
}
