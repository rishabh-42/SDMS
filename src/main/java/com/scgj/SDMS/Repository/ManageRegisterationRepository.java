package com.scgj.SDMS.Repository;

import com.scgj.SDMS.Models.ManageRegistration;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Repository
public interface ManageRegisterationRepository extends CrudRepository<ManageRegistration,Long> {

    @Query(value = "SELECT * FROM ManageRegistration WHERE status='pending'",nativeQuery = true)
    List<ManageRegistration> findAllByPendingStatus();

    @Query(value = "SELECT * FROM ManageRegistration WHERE status='approved'",nativeQuery = true)
    List<ManageRegistration> findAllByApproveStatus();

    @Query(value = "SELECT * FROM ManageRegistration WHERE status='rejected'",nativeQuery = true)
    List<ManageRegistration> findAllByRejectStatus();

    @Query(value = "UPDATE ManageRegistration SET status='approved' WHERE id='item'",nativeQuery = true)
    public ModelAndView alterStatus(int item);

    @Query(value = "UPDATE ManageRegistration SET status='rejected' WHERE id='item'",nativeQuery = true)
    public ModelAndView rejectStatus(@Param("item") int item);
}
