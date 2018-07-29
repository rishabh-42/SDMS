package com.scgj.SDMS.Models;


import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class TC_QP_ID implements Serializable {

    private int trainingCenterId;

    private int qualificationPackId;

    public TC_QP_ID(int trainingCenterId, int qualificationPackId) {
        this.trainingCenterId = trainingCenterId;
        this.qualificationPackId = qualificationPackId;
    }

    public int getTrainingCenterId() {
        return trainingCenterId;
    }

    public void setTrainingCenterId(int trainingCenterId) {
        this.trainingCenterId = trainingCenterId;
    }

    public int getQualificationPackId() {
        return qualificationPackId;
    }

    public void setQualificationPackId(int qualificationPackId) {
        this.qualificationPackId = qualificationPackId;
    }
}
