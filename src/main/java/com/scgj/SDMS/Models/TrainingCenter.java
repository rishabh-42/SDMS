package com.scgj.SDMS.Models;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "training_center")
public class TrainingCenter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "training_center_id")
    private int trainingCenterId;

    @Column(name = "training_center_name")
    private String trainingCenterName;


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "location_id")
    private Location locationId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "training_partner_id")
    private TrainingPartner TrainerPartnerId;

    public int getTrainingCenterId() {
        return trainingCenterId;
    }

    public void setTrainingCenterId(int trainingCenterId) {
        this.trainingCenterId = trainingCenterId;
    }

    public String getTrainingCenterName() {
        return trainingCenterName;
    }

    public void setTrainingCenterName(String trainingCenterName) {
        this.trainingCenterName = trainingCenterName;
    }

    public Location getLocationId() {
        return locationId;
    }

    public void setLocationId(Location locationId) {
        this.locationId = locationId;
    }

    public TrainingPartner getTrainerPartnerId() {
        return TrainerPartnerId;
    }

    public void setTrainerPartnerId(TrainingPartner trainerPartnerId) {
        TrainerPartnerId = trainerPartnerId;
    }

    public TrainingCenter(TrainingPartner trainerPartnerId) {
        TrainerPartnerId = trainerPartnerId;
    }
}



