package com.rome.romedical.controller;

import com.rome.romedical.entity.Patient;
import com.rome.romedical.entity.Study;
import com.rome.romedical.repository.StudyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class StudyController {

    @Autowired
    StudyRepository studyRepository;

    @PostMapping("studies/{patientID}")
    public Study createStudy (@RequestBody Study study, Patient patient, @PathVariable("patientID") Integer patientID) {
        return studyRepository.save(study, patient, patientID);
    }

    @GetMapping("/studies/{PatientID}")
    public ResponseEntity <List<Study>> getStudyByPatientId (@PathVariable("PatientID") Integer PatientID) {
        List<Study> studies = studyRepository.getStudyByPatientId(PatientID);
        return new ResponseEntity<>(studies, HttpStatus.OK);
    }

    @GetMapping("/studies")
    public List<Study> getStudies () {
            return studyRepository.getAllStudies();
    }
}
