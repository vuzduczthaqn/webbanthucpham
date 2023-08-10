package com.welcome.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

@Data
@Entity
@Table(name = "tbl.Bill", schema = "dbo", catalog = "demoweb")
public class Bill implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "bill_id", nullable = false)
    private int billId;
    @Basic
    @Column(name = "invoice_creation_date", nullable = true)
    private Timestamp invoiceCreationDate;
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = true)
    private Customer customer;
    @Basic
    @Column(name = "total_payment", nullable = true, length = 10)
    private String totalPayment;

    @OneToMany(mappedBy = "bill")
    private List<BillDetails> billDetailsListbyBill;
}
