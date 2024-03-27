package com.peripheral.productsapp.Repositories;

import com.peripheral.productsapp.Entities.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation, Long> {
}
