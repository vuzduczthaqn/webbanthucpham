package com.welcome.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Table(name = "tbl.Delivery_Address", schema = "dbo", catalog = "demoweb")
@Data
public class DeliveryAddress implements Serializable {
    @Id
    @Basic
    @Column(name = "address_id", nullable = true)
    private Integer addressId;
    @Column(columnDefinition = "nvarchar(255)")
    private String address;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    @Basic
    @Column(name = "number_phone", nullable = true, length = 10)
    private String numberPhone;
}
