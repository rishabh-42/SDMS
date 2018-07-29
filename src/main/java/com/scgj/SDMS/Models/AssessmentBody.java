package com.scgj.SDMS.Models;

import javax.persistence.*;

@Entity
@Table(name = "assessment_body")
public class AssessmentBody {

    @Id
    @Column(name = "assessment_id")
    private int assessmentBodyId;

    @Column(name = "assessment_body_name")
    private String assessmentBodyName;


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "application_id")
    private Application applicationId;

    public int getAssessmentBodyId() {
        return assessmentBodyId;
    }

    public void setAssessmentBodyId(int assessmentBodyId) {
        this.assessmentBodyId = assessmentBodyId;
    }

    public String getAssessmentBodyName() {
        return assessmentBodyName;
    }

    public void setAssessmentBodyName(String assessmentBodyName) {
        this.assessmentBodyName = assessmentBodyName;
    }

    public Application getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Application applicationId) {
        this.applicationId = applicationId;
    }
}
