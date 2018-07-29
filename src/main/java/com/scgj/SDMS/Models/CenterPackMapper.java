package com.scgj.SDMS.Models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CenterPackMapper {

    @Id
    private TC_QP_ID centerPackMapper;

    public TC_QP_ID getCenterPackMapper() {
        return centerPackMapper;
    }

    public void setCenterPackMapper(TC_QP_ID centerPackMapper) {
        this.centerPackMapper = centerPackMapper;
    }
}
