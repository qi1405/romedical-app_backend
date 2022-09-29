package com.rome.romedical.repository;

import com.rome.romedical.entity.Patient;

import java.util.List;

public interface PatientRepository {
    Patient save (Patient patient);
    Patient update (Patient patient);
    Patient getPatientById (Integer id);
    List<Patient> getAllPatients (String patientsName);
    List<Patient> findPatientByNameContaining (String patientsName);
    String deletePatientById (Integer id);
}