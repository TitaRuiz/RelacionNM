package com.corenetworks.RelacionNM.repositorio;

import com.corenetworks.RelacionNM.modelo.Conductor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IConductorRepo extends JpaRepository<Conductor,String> {
}
