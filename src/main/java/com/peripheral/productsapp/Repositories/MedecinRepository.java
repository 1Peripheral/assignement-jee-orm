package com.peripheral.productsapp.Repositories;

import com.peripheral.productsapp.Entities.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MedecinRepository extends JpaRepository<Medecin, Long> {
    List<Medecin> findByNom(String nom);
    List<Medecin> findBySpecialite(String specialite);
}
