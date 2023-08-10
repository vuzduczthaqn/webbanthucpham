package com.welcome.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "tbl.Product", schema = "dbo", catalog = "demoweb")
@Data
public class Product implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "product_id", nullable = false)
    private int productId;
    @Basic
    @Column(name = "product_name", nullable = true,columnDefinition = "NVARCHAR(255)")
    private String productName;
    @Basic
    @Column(name = "price", nullable = true, precision = 0)
    private Double price;
    @Basic
    @Column(name = "path_img", nullable = true, length = 255)
    private String pathImg;
    @Basic
    @Column(name = "weight", nullable = true, precision = 0)
    private Double weight;
    @Basic
    @Column(name = "Evaluate", nullable = true, precision = 0)
    private Double evaluate;
    @Basic
    @Column(name = "describe", nullable = true, length = 2147483647)
    private String describe;
    @Basic
    @Column(name = "status", nullable = true,columnDefinition = "NVARCHAR(255)")
    private String status;
    @ManyToOne
    @JoinColumn(name = "type_id", nullable = true)
    private ProductType type;
   @ManyToOne
    @JoinColumn(name = "producer_id", nullable = true)
    private Producer producer;
   @OneToMany(mappedBy = "product")
   private List<Cart> cartListByProduct;
}
