package com.rome.romedical.repository;

import com.rome.romedical.entity.Patient;
import com.rome.romedical.entity.Study;

import java.util.List;

public interface StudyRepository {
    Study save (Study study, Patient patient, Integer PatientID);

    List<Study> getStudyByPatientId (Integer PatientID);

    List<Study> getAllStudies ();
}
