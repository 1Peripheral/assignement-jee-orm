package com.peripheral.productsapp.Services;

import com.peripheral.productsapp.Entities.*;
import com.peripheral.productsapp.Repositories.ConsultationRepository;
import com.peripheral.productsapp.Repositories.MedecinRepository;
import com.peripheral.productsapp.Repositories.PatientRepository;
import com.peripheral.productsapp.Repositories.RendezVousRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@Transactional
public class HospitalServicesImpl implements IHospitalServices {
    private PatientRepository patientRepo;
    private MedecinRepository medecinRepo;
    private RendezVousRepository rdvRepo;
    private ConsultationRepository consultationRepo;

    public HospitalServicesImpl(PatientRepository patientRepo, MedecinRepository medecinRepo, RendezVousRepository rdvRepo, ConsultationRepository consultationRepo) {
        this.patientRepo = patientRepo;
        this.medecinRepo = medecinRepo;
        this.rdvRepo = rdvRepo;
        this.consultationRepo = consultationRepo;
    }

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepo.save(patient);
    }

    @Override
    public Medecin saveMedecin(Medecin medecin) {
        return medecinRepo.save(medecin);
    }

    @Override
    public RendezVous saveRDV(RendezVous rdv) {
        return rdvRepo.save(rdv);
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {
        return consultationRepo.save(consultation);
    }
    public void newRDV(Long idMedecin, Long idPatient, Date date) {
        RendezVous rdv = new RendezVous();
        rdv.setPatient(patientRepo.findById(idPatient).orElseThrow());
        rdv.setMedecin(medecinRepo.findById(idMedecin).orElseThrow());
        rdv.setDate(new Date());
        rdv.setStatus(StatusRDV.PENDING);
        rdvRepo.save(rdv);
    }
    public void newConsultation(Long idRDV, String rapport) {
        Consultation consultation = new Consultation();
        consultation.setDate(new Date());
        consultation.setRapport(rapport);
        consultation.setRdv(rdvRepo.findById(idRDV).orElseThrow());
        consultationRepo.save(consultation);
    }
}