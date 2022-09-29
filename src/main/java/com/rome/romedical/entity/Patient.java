package com.rome.romedical.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PatientID", nullable = false)
    private Integer patientID;

    @Column(name = "EthnicGroup", length = 20)
    private String ethnicGroup;

    @Column(name = "OtherPatientID")
    private Integer otherPatientID;

    @Column(name = "OtherPatientNames", length = 24)
    private String otherPatientNames;

//    @Convert(disableConversion = true)
    @Column(name = "PatientBirthTime")
    private LocalTime patientBirthTime;

    @Column(name = "PatientComments")
    private String patientComments;

    @Column(name = "PatientUID")
    private Integer patientUID;

    @JsonFormat(pattern="yyyy-MM-dd")
    @Column(name = "PatientsBirthDate")
    private LocalDate patientsBirthDate;


    @Column(name = "PatientsName", length = 24)
    private String patientsName;

    @Column(name = "PatientsSex", length = 1)
    private String patientsSex;

    public Patient(Integer id, String patientsName, String patientsSex, String ethnicGroup) {
        this.patientID = patientID;
        this.patientsName = patientsName;
        this.patientsSex = patientsSex;
        this.ethnicGroup = ethnicGroup;
    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getEthnicGroup() {
//        return ethnicGroup;
//    }
//
//    public void setEthnicGroup(String ethnicGroup) {
//        this.ethnicGroup = ethnicGroup;
//    }
//
//    public Integer getOtherPatientID() {
//        return otherPatientID;
//    }
//
//    public void setOtherPatientID(Integer otherPatientID) {
//        this.otherPatientID = otherPatientID;
//    }
//
//    public String getOtherPatientNames() {
//        return otherPatientNames;
//    }
//
//    public void setOtherPatientNames(String otherPatientNames) {
//        this.otherPatientNames = otherPatientNames;
//    }
//
//    public LocalTime getPatientBirthTime() {
//        return patientBirthTime;
//    }
//
//    public void setPatientBirthTime(LocalTime patientBirthTime) {
//        this.patientBirthTime = patientBirthTime;
//    }
//
//    public String getPatientComments() {
//        return patientComments;
//    }
//
//    public void setPatientComments(String patientComments) {
//        this.patientComments = patientComments;
//    }
//
//    public Integer getPatientUID() {
//        return patientUID;
//    }
//
//    public void setPatientUID(Integer patientUID) {
//        this.patientUID = patientUID;
//    }
//
//    public LocalDate getPatientsBirthDate() {
//        return patientsBirthDate;
//    }
//
//    public void setPatientsBirthDate(LocalDate patientsBirthDate) {
//        this.patientsBirthDate = patientsBirthDate;
//    }
//
//    public String getPatientsName() {
//        return patientsName;
//    }
//
//    public void setPatientsName(String patientsName) {
//        this.patientsName = patientsName;
//    }
//
//    public String getPatientsSex() {
//        return patientsSex;
//    }
//
//    public void setPatientsSex(String patientsSex) {
//        this.patientsSex = patientsSex;
//    }

}