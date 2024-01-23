package com.cbt.buyerservicejan24;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "paymentwalletlinks")
public class Paymentwalletlink {
    @Id
    @Column(name = "linkid", nullable = false, length = 10)
    private String linkid;

    @Column(name = "paymenttype", length = 10)
    private String paymenttype;

    @Column(name = "paymentrefid", length = 10)
    private String paymentrefid;

    @Column(name = "payerwallet", length = 10)
    private String payerwallet;

    @Column(name = "payeewallet", length = 10)
    private String payeewallet;

    @Column(name = "escrowwallet", length = 10)
    private String escrowwallet;

    @Column(name = "amount")
    private Integer amount;

}