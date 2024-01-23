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
@Table(name = "usernamewalletlinks")
public class Usernamewalletlink {
    @Id
    @Column(name = "username", nullable = false, length = 50)
    private String username;

    //TODO [JPA Buddy] generate columns from DB
}