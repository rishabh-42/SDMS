package com.scgj.SDMS.Models;

import javax.persistence.*;

@Entity
@Table(name = "candidatetest")
public class FaltuEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "candidate_id")
    private int candidateId;

    @Column(name = "is_certified")
    private Boolean isCertified;

    public int getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(int candidateId) {
        this.candidateId = candidateId;
    }

    public Boolean getCertified() {
        return isCertified;
    }

    public void setCertified(Boolean certified) {
        isCertified = certified;
    }

    public FaltuEntity(Boolean isCertified) {
        this.isCertified = isCertified;
    }

    public FaltuEntity() {
    }
}
