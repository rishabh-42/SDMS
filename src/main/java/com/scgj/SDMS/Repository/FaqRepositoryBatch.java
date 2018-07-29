package com.scgj.SDMS.Repository;

import com.scgj.SDMS.Models.Batch;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FaqRepositoryBatch extends CrudRepository<Batch,Integer> {

    @Query(value="SELECT count(batch_id) FROM Batches WHERE tp_id=1",nativeQuery = true)
    int tpBatchQueryLike();

    @Query(value="SELECT sum(no_of_candidates) FROM Batches WHERE tp_id=1",nativeQuery = true)
    int tpCandidateQueryLike();


}
