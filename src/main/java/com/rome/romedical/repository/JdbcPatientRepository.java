package com.rome.romedical.repository;

import com.rome.romedical.entity.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class JdbcPatientRepository implements PatientRepository {

    private static final String INSERT_USER_QUERY = "INSERT INTO Patient(patientsName, patientsSex, ethnicGroup, patientsBirthDate) VALUES(?, ?, ?, ?)";
    private static final String UPDATE_USER_BY_ID_QUERY = "UPDATE Patient SET patientsName=?, patientsSex=? WHERE patientID=?";
    private static final String GET_USER_BY_ID_QUERY = "SELECT * FROM Patient WHERE patientID=?";
    private static final String DELETE_USER_BY_ID_QUERY = "DELETE FROM Patient WHERE patientID=?";
    private static final String GET_ALL_USERS_QUERY = "SELECT * FROM Patient";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Patient save(Patient patient) {
        jdbcTemplate.update(INSERT_USER_QUERY, patient.getPatientsName(), patient.getPatientsSex(), patient.getEthnicGroup(), patient.getPatientsBirthDate());
        return patient;
    }

    @Override
    public Patient update(Patient patient) {
        jdbcTemplate.update(UPDATE_USER_BY_ID_QUERY, patient.getPatientsName(), patient.getPatientsSex(), patient.getPatientID());
        return patient;
    }

//    @Override
//    public Patient getPatientById(Integer id) {
//        return jdbcTemplate.queryForObject(GET_USER_BY_ID_QUERY, (rs, rowNum) -> {
//            return new Patient(rs.getInt("PatientID"), rs.getString("PatientsName"), rs.getString("PatientsSex"), rs.getString("EthnicGroup"));
//        },id);
//    }

    @Override
    public Patient getPatientById(Integer patientID) {
        Patient patient = jdbcTemplate.queryForObject(GET_USER_BY_ID_QUERY, BeanPropertyRowMapper.newInstance(Patient.class),patientID);
        return patient;
    }

//    @Override
//    public List<Patient> getAllPatients(String patientsName) {
//        return jdbcTemplate.query(GET_ALL_USERS_QUERY, (rs, rowNum) -> {
//            return new Patient(rs.getInt("PatientID"), rs.getString("PatientsName"), rs.getString("PatientsSex"), rs.getString("EthnicGroup"));
//        });
//    }
@Override
public List<Patient> getAllPatients(String patientsName) {
    return jdbcTemplate.query(GET_ALL_USERS_QUERY, BeanPropertyRowMapper.newInstance(Patient.class));
}

//    @Override
//    public List<Patient> findPatientByNameContaining(String patientsName) {
//        String q = "SELECT * from Patient WHERE PatientsName LIKE '%" + patientsName + "%'";
//        return jdbcTemplate.query(q, (rs, rowNum) -> {
//            return new Patient(rs.getInt("PatientID"), rs.getString("PatientsName"), rs.getString("PatientsSex"), rs.getString("EthnicGroup"));
//        });
//    }

    @Override
    public List<Patient> findPatientByNameContaining(String patientsName) {
        String q = "SELECT * from Patient WHERE PatientsName LIKE '%" + patientsName + "%'";
        return jdbcTemplate.query(q, BeanPropertyRowMapper.newInstance(Patient.class));
    }

    @Override
    public String deletePatientById(Integer patientID) {
        jdbcTemplate.update(DELETE_USER_BY_ID_QUERY, patientID);
        return "Patient with ID: " + patientID + " is deleted";
    }
}
