package com.welcome.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "tbl.Customer", schema = "dbo", catalog = "demoweb")
@Data
public class Customer implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "customer_id", nullable = false)
    private int customerId;
    @Basic
    @Column(name = "customer_name", nullable = true,columnDefinition = "NVARCHAR(255)")
    private String customerName;
    @Basic
    @Column(name = "age", nullable = true)
    private Integer age;
    @Basic
    @Column(name = "email", nullable = true,columnDefinition = "NVARCHAR(255)")
    private String email;
    @OneToOne(mappedBy = "customer")
    private User userId;
    @OneToMany(mappedBy = "customer")
    private List<Cart> cartListbyCutomer;
    @OneToMany(mappedBy = "customer")
    private List<Bill> billList;
    @OneToMany(mappedBy = "customer")
    private List<DeliveryAddress> deliveryAddressList;
}
