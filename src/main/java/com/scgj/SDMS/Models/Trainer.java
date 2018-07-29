package com.scgj.SDMS.Models;

import javax.persistence.*;

@Entity
@Table(name = "tariner")
public class Trainer {

    @Id
    @Column(name = "trainer_id")
    private int trainerId;


    @Column(name = "trainer_name")
    private String trainerName;


    @Column(name = "trainer_designation")
    private String tarinerDesignation;


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "location_id")
    private Location locationId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "training_partner_id")
    private TrainingPartner trainingPartnerId;

    public Trainer(TrainingPartner trainingPartnerId) {
        this.trainingPartnerId = trainingPartnerId;
    }

    public int getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(int trainerId) {
        this.trainerId = trainerId;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public String getTarinerDesignation() {
        return tarinerDesignation;
    }

    public void setTarinerDesignation(String tarinerDesignation) {
        this.tarinerDesignation = tarinerDesignation;
    }

    public Location getLocationId() {
        return locationId;
    }

    public void setLocationId(Location locationId) {
        this.locationId = locationId;
    }

    public TrainingPartner getTrainingPartnerId() {
        return trainingPartnerId;
    }

    public void setTrainingPartnerId(TrainingPartner trainingPartnerId) {
        this.trainingPartnerId = trainingPartnerId;
    }
}
