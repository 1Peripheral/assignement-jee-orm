package com.peripheral.productsapp.Repositories;

import com.peripheral.productsapp.Entities.Medecin;
import com.peripheral.productsapp.Entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    List<Patient> findByNom(String nom);
}
