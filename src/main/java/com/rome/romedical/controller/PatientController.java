package com.rome.romedical.controller;

import com.rome.romedical.entity.Patient;
import com.rome.romedical.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class PatientController {

    @Autowired
    PatientRepository patientRepository;

    @PostMapping("/patients")
    public Patient createPatient (@RequestBody Patient patient) {
        return patientRepository.save(patient);
    }

    @PutMapping("/patients")
    public Patient updatePatient (@RequestBody Patient patient) {
        return patientRepository.update(patient);
    }

    @GetMapping("/patients/{patientID}")
    public Patient getPatientById (@PathVariable("patientID") Integer patientID) {
        return patientRepository.getPatientById(patientID);
    }

    @GetMapping("/patients")
    public List<Patient> getPatients (String patientsName) {
        if (patientsName == null) {
            return patientRepository.getAllPatients(patientsName);
        }else{
            return patientRepository.findPatientByNameContaining(patientsName);
        }
    }

    @DeleteMapping("/patients/{patientID}")
    public String deletePatient(@PathVariable("patientID") Integer patientID) {
        return patientRepository.deletePatientById(patientID);
    }
}
