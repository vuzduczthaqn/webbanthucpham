package com.welcome.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "tbl.Producer", schema = "dbo", catalog = "demoweb")
@Data
public class Producer implements Serializable {
    @Id
    @Column(name = "producer_id", nullable = false, length = 10)
    private String producerId;
    @Basic
    @Column(name = "producer_name", nullable = true, length = 50,columnDefinition = "NVARCHAR(255)")
    private String producerName;
    @Basic
    @Column(name = "address", nullable = true, length = 50,columnDefinition = "NVARCHAR(255)")
    private String address;
    @OneToMany(mappedBy = "producer")
    private List<Product> productList;
}
