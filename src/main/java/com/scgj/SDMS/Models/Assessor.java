package com.scgj.SDMS.Models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "assessor")
public class Assessor {

    @Id
    @Column(name = "assessor_id")
    private int assessorId;

    @Column(name = "assessor_name")
    private String assessorName;


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "location_id")
    private Location locationId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "assessment_body_id")
    private AssessmentBody assessmentBodyId;

    public int getAssessorId() {
        return assessorId;
    }

    public void setAssessorId(int assessorId) {
        this.assessorId = assessorId;
    }

    public String getAssessorName() {
        return assessorName;
    }

    public void setAssessorName(String assessorName) {
        this.assessorName = assessorName;
    }

    public Location getLocationId() {
        return locationId;
    }

    public void setLocationId(Location locationId) {
        this.locationId = locationId;
    }

    public AssessmentBody getAssessmentBodyId() {
        return assessmentBodyId;
    }

    public void setAssessmentBodyId(AssessmentBody assessmentBodyId) {
        this.assessmentBodyId = assessmentBodyId;
    }
}
