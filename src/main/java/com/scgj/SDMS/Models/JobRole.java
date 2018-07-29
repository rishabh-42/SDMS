package com.scgj.SDMS.Models;


import javax.persistence.*;

@Entity
@Table(name = "job_role")
public class JobRole {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id")
    private int jobRoleId;

    @Column(name = "job")
    private String jobRoleName;

    public JobRole(String jobRoleName) {
        this.jobRoleName = jobRoleName;
    }

    public int getJobRoleId() {
        return jobRoleId;
    }

    public void setJobRoleId(int jobRoleId) {
        this.jobRoleId = jobRoleId;
    }

    public String getJobRoleName() {
        return jobRoleName;
    }

    public void setJobRoleName(String jobRoleName) {
        this.jobRoleName = jobRoleName;
    }
}
