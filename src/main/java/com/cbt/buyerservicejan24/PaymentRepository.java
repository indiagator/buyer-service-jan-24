package com.cbt.buyerservicejan24;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface PaymentRepository extends JpaRepository<Payment, String> {


    Optional<Payment> findByOrderid(String orderid);

    @Transactional
    @Modifying
    @Query("update Payment p set p.status = ?1 where p.id = ?2")
    int updateStatusById(String status, String id);

}