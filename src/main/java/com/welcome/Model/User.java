package com.welcome.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Table(name = "tbl.User", schema = "dbo", catalog = "demoweb")
@Data
public class User implements Serializable {
    @Id
    @OneToOne
    @JoinColumn(name = "customer_id",foreignKey = @ForeignKey(name = "FK_Customer_User"))
    private Customer customer;
    @Id
    @ManyToOne
    @JoinColumn(name = "position_id")
    private Position position;
    @Column(name = "username", nullable = false, length = 30)
    private String username;
    @Basic
    @Column(name = "password", nullable = true, length = 30)
    private String password;
}
