package com.cbt.buyerservicejan24;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @Column(name = "orderid", nullable = false, length = 10)
    private String orderid;

    @Column(name = "offerid", nullable = false, length = 10)
    private String offerid;

    @Column(name = "buyername", nullable = false, length = 10)
    private String buyername;

    @Column(name = "bid")
    private Integer bid;

}