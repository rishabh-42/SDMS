package com.scgj.SDMS.Repository;

import com.scgj.SDMS.Models.Candidate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentPanelRepository extends CrudRepository<Candidate,Integer> {

}
