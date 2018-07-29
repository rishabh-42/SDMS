package com.scgj.SDMS.Models;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "batch")
public class Batch {

    @Id
    @Column(name = "batch_id")
    private int batchId;

    @Column(name = "batch_name")
    private String batchName;

    @Column(name = "batch_type")
    private String batchType;

    @Column(name = "batch_mode")
    private String batchMode;

    @Column(name = "batch_strength")
    private String batchStrength;

    @Column(name = "batch_start_date")
    private Date batchStartDate;

    @Column(name = "batch_end_date")
    private Date batchEndDate;

    public TrainingPartner getTrainingPartnerId() {
        return trainingPartnerId;
    }

    public void setTrainingPartnerId(TrainingPartner trainingPartnerId) {
        this.trainingPartnerId = trainingPartnerId;
    }

    public TrainingCenter getTrainingCenterId() {
        return trainingCenterId;
    }

    public void setTrainingCenterId(TrainingCenter trainingCenterId) {
        this.trainingCenterId = trainingCenterId;
    }

    public JobRole getJobRoleId() {
        return jobRoleId;
    }

    public void setJobRoleId(JobRole jobRoleId) {
        this.jobRoleId = jobRoleId;
    }

    @Column(name = "batch_level")
    private int batchLevel;

    @Column(name = "result_approved")
    private boolean resultApproved;

    @Column(name = "assessment_date")
    private Date assessmentDate;

    @Column(name = "total_fail")
    private int totalFail;

    @Column(name = "total_appeared")
    private int totalAppeared;

    @Column(name = "total_pass")
    private int totalPass;

    @Column(name = "total_certified")
    private int totalCertified;

    @Column(name = "maximum_marks_theory")
    private int maximumMarksTheory;

    @Column(name = "maximum_marks_practical")
    private int maximumMarksPractical;


    @Column(name = "result_approved_date")
    private Date resultApprovedDate;

    @Column(name = "batch_assignment_date")
    private Date batchAssignmentDate;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "training_partner_id")
    private TrainingPartner trainingPartnerId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "training_center_id")
    private TrainingCenter trainingCenterId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "qualification_pack_id")
    private QualificationPack qualificationPackId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "assessment_body_id")
    private AssessmentBody assessmentBodyId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "assessor_id")
    private Assessor assessorId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "trainer_id")
    private Trainer trainerId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "job_role_id")
    private JobRole jobRoleId;

    public Batch(TrainingPartner trainingPartnerId, TrainingCenter trainingCenterId) {
        this.trainingPartnerId = trainingPartnerId;
        this.trainingCenterId = trainingCenterId;
    }

    public int getBatchId() {
        return batchId;
    }

    public void setBatchId(int batchId) {
        this.batchId = batchId;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public String getBatchType() {
        return batchType;
    }

    public void setBatchType(String batchType) {
        this.batchType = batchType;
    }

    public String getBatchMode() {
        return batchMode;
    }

    public void setBatchMode(String batchMode) {
        this.batchMode = batchMode;
    }

    public String getBatchStrength() {
        return batchStrength;
    }

    public void setBatchStrength(String batchStrength) {
        this.batchStrength = batchStrength;
    }

    public Date getBatchStartDate() {
        return batchStartDate;
    }

    public void setBatchStartDate(Date batchStartDate) {
        this.batchStartDate = batchStartDate;
    }

    public Date getBatchEndDate() {
        return batchEndDate;
    }

    public void setBatchEndDate(Date batchEndDate) {
        this.batchEndDate = batchEndDate;
    }

    public int getBatchLevel() {
        return batchLevel;
    }

    public void setBatchLevel(int batchLevel) {
        this.batchLevel = batchLevel;
    }

    public boolean isResultApproved() {
        return resultApproved;
    }

    public void setResultApproved(boolean resultApproved) {
        this.resultApproved = resultApproved;
    }

    public Date getAssessmentDate() {
        return assessmentDate;
    }

    public void setAssessmentDate(Date assessmentDate) {
        this.assessmentDate = assessmentDate;
    }

    public int getTotalFail() {
        return totalFail;
    }

    public void setTotalFail(int totalFail) {
        this.totalFail = totalFail;
    }

    public int getTotalAppeared() {
        return totalAppeared;
    }

    public void setTotalAppeared(int totalAppeared) {
        this.totalAppeared = totalAppeared;
    }

    public int getTotalPass() {
        return totalPass;
    }

    public void setTotalPass(int totalPass) {
        this.totalPass = totalPass;
    }

    public int getTotalCertified() {
        return totalCertified;
    }

    public void setTotalCertified(int totalCertified) {
        this.totalCertified = totalCertified;
    }

    public int getMaximumMarksTheory() {
        return maximumMarksTheory;
    }

    public void setMaximumMarksTheory(int maximumMarksTheory) {
        this.maximumMarksTheory = maximumMarksTheory;
    }

    public int getMaximumMarksPractical() {
        return maximumMarksPractical;
    }

    public void setMaximumMarksPractical(int maximumMarksPractical) {
        this.maximumMarksPractical = maximumMarksPractical;
    }


    public Date getResultApprovedDate() {
        return resultApprovedDate;
    }

    public void setResultApprovedDate(Date resultApprovedDate) {
        this.resultApprovedDate = resultApprovedDate;
    }

    public Date getBatchAssignmentDate() {
        return batchAssignmentDate;
    }

    public void setBatchAssignmentDate(Date batchAssignmentDate) {
        this.batchAssignmentDate = batchAssignmentDate;
    }


    public QualificationPack getQualificationPackId() {
        return qualificationPackId;
    }

    public void setQualificationPackId(QualificationPack qualificationPackId) {
        this.qualificationPackId = qualificationPackId;
    }

    public AssessmentBody getAssessmentBodyId() {
        return assessmentBodyId;
    }

    public void setAssessmentBodyId(AssessmentBody assessmentBodyId) {
        this.assessmentBodyId = assessmentBodyId;
    }

    public Assessor getAssessorId() {
        return assessorId;
    }

    public void setAssessorId(Assessor assessorId) {
        this.assessorId = assessorId;
    }

    public Trainer getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(Trainer trainerId) {
        this.trainerId = trainerId;
    }
}
