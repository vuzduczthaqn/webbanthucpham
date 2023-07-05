package com.welcome.Model;

import jakarta.persistence.*;

import java.io.Serializable;

@Embeddable
public class UserPK implements Serializable {
    @Id
    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customerId;
    @Id
    @ManyToOne
    @JoinColumn(name = "position_id")
    private Position position;
}
