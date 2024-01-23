package com.cbt.buyerservicejan24;

import jakarta.persistence.*;

@Entity
@Table(name = "payments")
public class Payment {
    @Id
    @Column(name = "id", nullable = false, length = 10)
    private String id;

    @Column(name = "orderid", nullable = false, length = 10)
    private String orderid;

    @Column(name = "offerid", nullable = false, length = 10)
    private String offerid;

    @Column(name = "status", length = 10)
    private String status;

    @Column(name = "paymentwalletlink", nullable = false, length = 10)
    private String paymentwalletlink;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getOfferid() {
        return offerid;
    }

    public void setOfferid(String offerid) {
        this.offerid = offerid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPaymentwalletlink() {
        return paymentwalletlink;
    }

    public void setPaymentwalletlink(String paymentwalletlink) {
        this.paymentwalletlink = paymentwalletlink;
    }



}