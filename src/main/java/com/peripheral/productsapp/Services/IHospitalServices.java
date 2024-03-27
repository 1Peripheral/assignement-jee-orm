package com.peripheral.productsapp.Services;

import com.peripheral.productsapp.Entities.Consultation;
import com.peripheral.productsapp.Entities.Medecin;
import com.peripheral.productsapp.Entities.Patient;
import com.peripheral.productsapp.Entities.RendezVous;

import java.util.Date;

public interface IHospitalServices {
    public Patient savePatient(Patient patient);
    public Medecin saveMedecin(Medecin medecin);
    public RendezVous saveRDV(RendezVous rdv);
    public Consultation saveConsultation(Consultation consultation);
    public void newRDV(Long idMedecin, Long idPatient, Date date);
    public void newConsultation(Long idRDV, String rapport);
}
