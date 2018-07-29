package com.scgj.SDMS.Services;

import com.scgj.SDMS.Repository.FaqRepositoryBatch;
import com.scgj.SDMS.Repository.FaqRepositoryCandidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FaqService {
    @Autowired
    private FaqRepositoryCandidate faqRepositoryCandidate;
    @Autowired
    private FaqRepositoryBatch faqRepositoryBatch;
/*
    public List<Candidate> getFaq1 ()
    {
        List<Candidate> candidate = new ArrayList<>();
        faqRepository.findAll().forEach((e)-> {
            return candidate.add((e));
        });
        return candidate;

    }
*/

    public long[] getFaq1 ()
    {
        long[] count=new long[]{0,0,0};
        count[0] = faqRepositoryCandidate.countAllQueryLike();
        count[1] = faqRepositoryCandidate.countByIsassessedQueryLike();
        count[2] = faqRepositoryCandidate.countByIspassQueryLike();
        return count;

    }

    public long[] getFaq2 ()
    {
        long[] gender=new long[]{0,0,0};
        gender[0] = faqRepositoryCandidate.countByIsmaleQueryLike();
        gender[1] = faqRepositoryCandidate.countByIsfemaleQueryLike();
        gender[2] = faqRepositoryCandidate.countByIsothersQueryLike();
        return gender;

    }

    public int[] getFaq3 ()
    {
        int myList[] = new int[2];

        myList[0]= faqRepositoryBatch.tpBatchQueryLike();
        myList[1]= faqRepositoryBatch.tpCandidateQueryLike();
        return myList;

    }

}
