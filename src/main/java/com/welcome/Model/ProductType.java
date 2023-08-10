package com.welcome.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "tbl.Product_Type", schema = "dbo", catalog = "demoweb")
@Data
public class ProductType implements Serializable {
    @Id
    @Column(name = "type_id", nullable = false, length = 10)
    private String typeId;
    @Basic
    @Column(name = "type_name", nullable = true,columnDefinition = "NVARCHAR(255)")
    private String typeName;
    @OneToMany (mappedBy = "type")
    public List<Product> productList;
}
