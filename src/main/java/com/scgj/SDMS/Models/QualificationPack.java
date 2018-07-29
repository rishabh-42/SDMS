package com.scgj.SDMS.Models;


import javax.persistence.*;

@Entity
@Table(name = "qualification_pack")
public class QualificationPack {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "qp_id")
    private int qpId;

    @Column(name = "qp_name")
    private String qpName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "job_role_id")
    private JobRole jobRole;

    public QualificationPack(String qpName, JobRole jobRole) {
        this.qpName = qpName;
        this.jobRole = jobRole;
    }

    public int getQpId() {
        return qpId;
    }

    public void setQpId(int qpId) {
        this.qpId = qpId;
    }

    public String getQpName() {
        return qpName;
    }

    public void setQpName(String qpName) {
        this.qpName = qpName;
    }


}
