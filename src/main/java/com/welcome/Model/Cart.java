package com.welcome.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Table(name = "tbl.Cart", schema = "dbo", catalog = "demoweb")
@Data
public class Cart implements Serializable {
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id",nullable = false)
    private Customer customer;
    @Id
    @ManyToOne
    @JoinColumn(name = "product_id",nullable = false)
    private Product product;
    @Basic
    @Column(name = "quantity", nullable = true)
    private Integer quantity;
    @Basic
    @Column(name = "payment", nullable = true, precision = 0)
    private Double payment;
}
