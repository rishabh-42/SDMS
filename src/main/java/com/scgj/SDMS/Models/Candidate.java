package com.scgj.SDMS.Models;


import org.hibernate.validator.constraints.Email;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "candidate")
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "candidate_id")
    private int candidateId;

    @Column(name = "candidate_name")
    private String candidateName;

    @Column(name = "enrollment_number")
    private int enrollmentNumber;

    @Column(name = "gender")
    private String gender;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @Column(name = "mobile_number")
    private int mobileNumber;

    @Column(name = "aadhar_number")
    private int aadharNumber;

    @Email
    @Column(name = "email")
    private String candidateEmail;

    @Column(name = "education_level")
    private int educationLevel;

    @Column(name = "result")
    private String result;

    @Column(name = "certified")
    private Boolean certified;

    @Column(name = "date_of_joining")
    private Date dateOfJoining;

    @Column(name = "marks_theory")
    private int marksTheory;

    @Column(name = "marks_practical")
    private int marksPractical;

    @Column(name = "placement_status")
    private String placementStatus;

    @Column(name = "employment_type")
    private String employmentType;

    @Column(name = "name_of_father_husband")
    private String nameOfFatherHusband;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "batch_id")
    private Batch batchId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employer_id")
    private Employer employerId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "trainer_id")
    private Trainer trainerId;

    public int getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(int candidateId) {
        this.candidateId = candidateId;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public int getEnrollmentNumber() {
        return enrollmentNumber;
    }

    public void setEnrollmentNumber(int enrollmentNumber) {
        this.enrollmentNumber = enrollmentNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public int getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(int aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public String getCandidateEmail() {
        return candidateEmail;
    }

    public void setCandidateEmail(String candidateEmail) {
        this.candidateEmail = candidateEmail;
    }

    public int getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(int educationLevel) {
        this.educationLevel = educationLevel;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Boolean isCertified() {
        return certified;
    }

    public void setCertified(Boolean certified) {
        this.certified = certified;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public int getMarksTheory() {
        return marksTheory;
    }

    public void setMarksTheory(int marksTheory) {
        this.marksTheory = marksTheory;
    }

    public int getMarksPractical() {
        return marksPractical;
    }

    public void setMarksPractical(int marksPractical) {
        this.marksPractical = marksPractical;
    }

    public String getPlacementStatus() {
        return placementStatus;
    }

    public void setPlacementStatus(String placementStatus) {
        this.placementStatus = placementStatus;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

    public String getNameOfFatherHusband() {
        return nameOfFatherHusband;
    }

    public void setNameOfFatherHusband(String nameOfFatherHusband) {
        this.nameOfFatherHusband = nameOfFatherHusband;
    }

    public Batch getBatchId() {
        return batchId;
    }

    public void setBatchId(Batch batchId) {
        this.batchId = batchId;
    }

    public Candidate(String candidateName, int enrollmentNumber, String gender, Date dateOfBirth, int mobileNumber, int aadharNumber, String candidateEmail, int educationLevel, String result, Boolean certified, Date dateOfJoining, int marksTheory, int marksPractical, String placementStatus, String employmentType, String nameOfFatherHusband, Batch batchId, Employer employerId, Trainer trainerId) {
        this.candidateName = candidateName;
        this.enrollmentNumber = enrollmentNumber;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.mobileNumber = mobileNumber;
        this.aadharNumber = aadharNumber;
        this.candidateEmail = candidateEmail;
        this.educationLevel = educationLevel;
        this.result = result;
        this.certified = certified;
        this.dateOfJoining = dateOfJoining;
        this.marksTheory = marksTheory;
        this.marksPractical = marksPractical;
        this.placementStatus = placementStatus;
        this.employmentType = employmentType;
        this.nameOfFatherHusband = nameOfFatherHusband;
        this.batchId = batchId;
        this.employerId = employerId;
        this.trainerId = trainerId;
    }

    public Employer getEmployerId() {
        return employerId;
    }

    public void setEmployerId(Employer employerId) {
        this.employerId = employerId;
    }

    public Trainer getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(Trainer trainerId) {
        this.trainerId = trainerId;
    }
}
