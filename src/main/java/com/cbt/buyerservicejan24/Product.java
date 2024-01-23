package com.cbt.buyerservicejan24;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "products")
public class Product {
    @Id
    @Column(name = "hscode", nullable = false, length = 8)
    private String hscode;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "unit", length = 5)
    private String unit;

}