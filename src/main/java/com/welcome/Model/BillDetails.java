package com.welcome.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "tbl.Bill_details", schema = "dbo", catalog = "demoweb")
public class BillDetails implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn(name = "bill_id")
    private Bill bill;
    @Id
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    @Basic
    @Column(name = "unit_price", nullable = true, precision = 0)
    private Double unitPrice;
    @Basic
    @Column(name = "quantity", nullable = true)
    private Integer quantity;
}
