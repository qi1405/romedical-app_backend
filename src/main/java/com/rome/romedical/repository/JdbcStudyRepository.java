package com.rome.romedical.repository;

import com.rome.romedical.entity.Patient;
import com.rome.romedical.entity.Study;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@Repository
public class JdbcStudyRepository implements StudyRepository {

    private static final String GET_ALL_STUDIES_QUERY = "SELECT * FROM Study";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Study save(Study study, Patient patient, Integer patientID) {
        String q = "  insert into Study ( patientID, studyDescription, studyDate )\n" +
                "  select ?, ?, ?\n" +
                "  from Patient p\n" +
                "  where p.patientID = "+ patientID + "";
        jdbcTemplate.update(q, patient.getPatientID(), study.getStudyDescription(), study.getStudyDate());
        return study;
    }

    @Override
    public List<Study> getStudyByPatientId(Integer PatientID) {
        String q = "SELECT * from Study WHERE PatientID = " + PatientID + "";
        return jdbcTemplate.query(q, BeanPropertyRowMapper.newInstance(Study.class));
    }

    @Override
    public List<Study> getAllStudies() {
        return jdbcTemplate.query(GET_ALL_STUDIES_QUERY, BeanPropertyRowMapper.newInstance(Study.class));
    }
}
