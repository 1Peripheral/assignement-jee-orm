package com.peripheral.productsapp;

import com.peripheral.productsapp.Entities.Medecin;
import com.peripheral.productsapp.Entities.Patient;
import com.peripheral.productsapp.Repositories.MedecinRepository;
import com.peripheral.productsapp.Repositories.PatientRepository;
import com.peripheral.productsapp.Services.IHospitalServices;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class HospitalApp {
	public static void main(String[] args) {
		SpringApplication.run(HospitalApp.class, args);
	}

	@Bean
	CommandLineRunner start(IHospitalServices hospitalServices) {
		return args -> {
			Stream.of("Hassan", "Hocine", "Hassna")
					.forEach(name -> {
						Patient p = new Patient();
						p.setNom(name);
						p.setDateNaissance(new Date());
						p.setEstMalade(false);
						hospitalServices.savePatient(p);
					});
			Stream.of("Amine", "Amina", "Aymen")
					.forEach(name -> {
						Medecin m = new Medecin();
						m.setNom(name);
						m.setEmail(name + "@hospital.com");
						m.setSpecialite(Math.random()>0.5?"Dermatologue":"Dentiste");
						hospitalServices.saveMedecin(m);
					});

			hospitalServices.newRDV(1L, 1L, new Date());
			hospitalServices.newRDV(1L, 2L, new Date());
			hospitalServices.newRDV(2L, 3L, new Date());

			hospitalServices.newConsultation(1L, "Consultation 1");
			hospitalServices.newConsultation(2L, "Consultation 2");
			hospitalServices.newConsultation(3L, "Consultation 3");
		};
	}
}
