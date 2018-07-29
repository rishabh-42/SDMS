package com.scgj.SDMS.Repository;

import com.scgj.SDMS.Models.Candidate;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FaqRepositoryCandidate extends CrudRepository<Candidate,Integer> {

    List<Candidate> findAll();

    @Query(value = "SELECT count(cid) FROM candidate",nativeQuery = true)
    Long countAllQueryLike();
    @Query(value="SELECT count(cid) FROM candidate WHERE is_pass=1",nativeQuery = true)
    public Long countByIspassQueryLike();

    @Query(value="SELECT count(cid) FROM candidate WHERE is_assessed=1",nativeQuery = true)
    Long countByIsassessedQueryLike();

    @Query(value="SELECT count(cid) FROM candidate WHERE c_gender='male'",nativeQuery = true)
    Long countByIsmaleQueryLike();

    @Query(value="SELECT count(cid) FROM candidate WHERE c_gender='female'",nativeQuery = true)
    Long countByIsfemaleQueryLike();

    @Query(value="SELECT count(cid) FROM candidate WHERE c_gender='others'",nativeQuery = true)
    Long countByIsothersQueryLike();
}
