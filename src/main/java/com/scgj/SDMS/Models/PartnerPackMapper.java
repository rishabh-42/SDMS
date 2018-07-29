package com.scgj.SDMS.Models;



import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PartnerPackMapper {

    @Id
    private TP_QP_ID partnerPackMapper;

    public TP_QP_ID getPartnerPackMapper() {
        return partnerPackMapper;
    }

    public void setPartnerPackMapper(TP_QP_ID partnerPackMapper) {
        this.partnerPackMapper = partnerPackMapper;
    }
}
