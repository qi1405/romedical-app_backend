package com.rome.romedical.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Study {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "StudyID", nullable = false)
    private Integer studyID;

    @Column(name = "AccessDate")
    private LocalDate accessDate;

    @Column(name = "AccessTime")
    private LocalTime accessTime;

    @Column(name = "AccessionNumber", length = 10)
    private String accessionNumber;

    @Column(name = "AdditionalPatientsHistory")
    private String additionalPatientsHistory;

    @Column(name = "AdmittingDiagnosesDescription")
    private String admittingDiagnosesDescription;

    @Column(name = "InstitutionName", length = 30)
    private String institutionName;

    @Column(name = "InstitutionalDepartmentName", length = 30)
    private String institutionalDepartmentName;

    @Column(name = "Modality", length = 10)
    private String modality;

    @Column(name = "NameOfPhysiciansReadingStudy", length = 20)
    private String nameOfPhysiciansReadingStudy;

    @Column(name = "Occupation", length = 20)
    private String occupation;

    @Column(name = "OperatorsName", length = 24)
    private String operatorsName;

    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "PatientID", nullable = false)
    private Integer patientID;

    @Column(name = "PatientUID")
    private Integer patientUID;

    @Column(name = "PatientsAge")
    private Integer patientsAge;

    @Column(name = "PatientsSize", precision = 18)
    private BigDecimal patientsSize;

    @Column(name = "PatientsWeight", precision = 18)
    private BigDecimal patientsWeight;

    @Column(name = "ReadStatus")
    private Boolean readStatus;

    @Column(name = "ReferencedStudySequence", length = 10)
    private String referencedStudySequence;

    @Column(name = "ReferringPhysiciansName", length = 20)
    private String referringPhysiciansName;

    @Column(name = "Status", length = 10)
    private String status;

    @JsonFormat(pattern="dd-MM-yyyy")
    @Column(name = "StudyDate")
    private LocalDate studyDate;

    @Lob
    @Column(name = "StudyDescription")
    private String studyDescription;

    @Column(name = "StudyInstanceUID")
    private Integer studyInstanceUID;

    @Column(name = "StudyTime")
    private LocalTime studyTime;

//    public Integer getStudyID() {
//        return studyID;
//    }
//
//    public void setId(Integer studyID) {
//        this.studyID = studyID;
//    }
//
//    public LocalDate getAccessDate() {
//        return accessDate;
//    }
//
//    public void setAccessDate(LocalDate accessDate) {
//        this.accessDate = accessDate;
//    }
//
//    public LocalTime getAccessTime() {
//        return accessTime;
//    }
//
//    public void setAccessTime(LocalTime accessTime) {
//        this.accessTime = accessTime;
//    }
//
//    public String getAccessionNumber() {
//        return accessionNumber;
//    }
//
//    public void setAccessionNumber(String accessionNumber) {
//        this.accessionNumber = accessionNumber;
//    }
//
//    public String getAdditionalPatientsHistory() {
//        return additionalPatientsHistory;
//    }
//
//    public void setAdditionalPatientsHistory(String additionalPatientsHistory) {
//        this.additionalPatientsHistory = additionalPatientsHistory;
//    }
//
//    public String getAdmittingDiagnosesDescription() {
//        return admittingDiagnosesDescription;
//    }
//
//    public void setAdmittingDiagnosesDescription(String admittingDiagnosesDescription) {
//        this.admittingDiagnosesDescription = admittingDiagnosesDescription;
//    }
//
//    public String getInstitutionName() {
//        return institutionName;
//    }
//
//    public void setInstitutionName(String institutionName) {
//        this.institutionName = institutionName;
//    }
//
//    public String getInstitutionalDepartmentName() {
//        return institutionalDepartmentName;
//    }
//
//    public void setInstitutionalDepartmentName(String institutionalDepartmentName) {
//        this.institutionalDepartmentName = institutionalDepartmentName;
//    }
//
//    public String getModality() {
//        return modality;
//    }
//
//    public void setModality(String modality) {
//        this.modality = modality;
//    }
//
//    public String getNameOfPhysiciansReadingStudy() {
//        return nameOfPhysiciansReadingStudy;
//    }
//
//    public void setNameOfPhysiciansReadingStudy(String nameOfPhysiciansReadingStudy) {
//        this.nameOfPhysiciansReadingStudy = nameOfPhysiciansReadingStudy;
//    }
//
//    public String getOccupation() {
//        return occupation;
//    }
//
//    public void setOccupation(String occupation) {
//        this.occupation = occupation;
//    }
//
//    public String getOperatorsName() {
//        return operatorsName;
//    }
//
//    public void setOperatorsName(String operatorsName) {
//        this.operatorsName = operatorsName;
//    }
//
//    public Integer getPatientID() {
//        return patientID;
//    }
//
//    public void setPatientID(Integer patientID) {
//        this.patientID = patientID;
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
//    public Integer getPatientsAge() {
//        return patientsAge;
//    }
//
//    public void setPatientsAge(Integer patientsAge) {
//        this.patientsAge = patientsAge;
//    }
//
//    public BigDecimal getPatientsSize() {
//        return patientsSize;
//    }
//
//    public void setPatientsSize(BigDecimal patientsSize) {
//        this.patientsSize = patientsSize;
//    }
//
//    public BigDecimal getPatientsWeight() {
//        return patientsWeight;
//    }
//
//    public void setPatientsWeight(BigDecimal patientsWeight) {
//        this.patientsWeight = patientsWeight;
//    }
//
//    public Boolean getReadStatus() {
//        return readStatus;
//    }
//
//    public void setReadStatus(Boolean readStatus) {
//        this.readStatus = readStatus;
//    }
//
//    public String getReferencedStudySequence() {
//        return referencedStudySequence;
//    }
//
//    public void setReferencedStudySequence(String referencedStudySequence) {
//        this.referencedStudySequence = referencedStudySequence;
//    }
//
//    public String getReferringPhysiciansName() {
//        return referringPhysiciansName;
//    }
//
//    public void setReferringPhysiciansName(String referringPhysiciansName) {
//        this.referringPhysiciansName = referringPhysiciansName;
//    }
//
//    public String getStatus() {
//        return status;
//    }
//
//    public void setStatus(String status) {
//        this.status = status;
//    }
//
//    public LocalDate getStudyDate() {
//        return studyDate;
//    }
//
//    public void setStudyDate(LocalDate studyDate) {
//        this.studyDate = studyDate;
//    }
//
//    public String getStudyDescription() {
//        return studyDescription;
//    }
//
//    public void setStudyDescription(String studyDescription) {
//        this.studyDescription = studyDescription;
//    }
//
//    public Integer getStudyInstanceUID() {
//        return studyInstanceUID;
//    }
//
//    public void setStudyInstanceUID(Integer studyInstanceUID) {
//        this.studyInstanceUID = studyInstanceUID;
//    }
//
//    public LocalTime getStudyTime() {
//        return studyTime;
//    }
//
//    public void setStudyTime(LocalTime studyTime) {
//        this.studyTime = studyTime;
//    }

}