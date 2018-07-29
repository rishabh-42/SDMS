package com.scgj.SDMS.Models;


import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Ab_TC_ID implements Serializable {

    private int assessmentBody;

    private int trainingCenter;

    public Ab_TC_ID(int assessmentBody, int trainingCenter) {
        this.assessmentBody = assessmentBody;
        this.trainingCenter = trainingCenter;
    }

    public int getAssessmentBody() {
        return assessmentBody;
    }

    public void setAssessmentBody(int assessmentBody) {
        this.assessmentBody = assessmentBody;
    }

    public int getTrainingCenter() {
        return trainingCenter;
    }

    public void setTrainingCenter(int trainingCenter) {
        this.trainingCenter = trainingCenter;
    }
}
