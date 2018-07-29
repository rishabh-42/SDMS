package com.scgj.SDMS.Models;

import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name="manageregistration")
public class ManageRegistration {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="institutionName")
    private String institutionName;
    @Column(name="Type")
    private String institutionType;
    @Column(name="Date")
    @Convert(converter = Jsr310JpaConverters.LocalDateConverter.class)
    private LocalDate Date;
    @Column(name="Location")
    private String location;
    @Column(name="comments")
    private String comments;
    @Column(name ="status")
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public String getInstitutionType() {
        return institutionType;
    }

    public void setInstitutionType(String institutionType) {
        this.institutionType = institutionType;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public ManageRegistration() {
    }

    public ManageRegistration(String institutionName, String institutionType, LocalDate date, String location, String comments, String status) {

        this.institutionName = institutionName;
        this.institutionType = institutionType;
        Date = date;
        this.location = location;
        this.comments = comments;
        this.status=status;
    }
}
