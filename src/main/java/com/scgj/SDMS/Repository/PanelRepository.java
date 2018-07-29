package com.scgj.SDMS.Repository;

import com.scgj.SDMS.Models.Employer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PanelRepository extends CrudRepository<Employer,Integer> {

}
