package com.scgj.SDMS.Models;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ABodyCenterMapper {

    public ABodyCenterMapper() {
    }



    @Id
    private Ab_TC_ID aBodyCenterMapper;

    public Ab_TC_ID getaBodyCenterMapper() {
        return aBodyCenterMapper;
    }

    public void setaBodyCenterMapper(Ab_TC_ID aBodyCenterMapper) {
        this.aBodyCenterMapper = aBodyCenterMapper;
    }
}
