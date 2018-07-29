package com.scgj.SDMS.Models;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class TP_QP_ID implements Serializable {

    private int trainingPartnerId;
    private int qualificationPackId;

    public TP_QP_ID(int trainingPartnerId, int qualificationPackId) {
        this.trainingPartnerId = trainingPartnerId;
        this.qualificationPackId = qualificationPackId;
    }

    public int getTrainingPartnerId() {
        return trainingPartnerId;
    }

    public void setTrainingPartnerId(int trainingPartnerId) {
        this.trainingPartnerId = trainingPartnerId;
    }

    public int getQualificationPackId() {
        return qualificationPackId;
    }

    public void setQualificationPackId(int qualificationPackId) {
        this.qualificationPackId = qualificationPackId;
    }
}
