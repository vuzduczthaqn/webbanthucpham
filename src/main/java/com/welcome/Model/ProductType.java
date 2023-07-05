package com.welcome.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tbl.Product_Type", schema = "dbo", catalog = "demoweb")
public class ProductType {
    @Id
    @Column(name = "type_id", nullable = false, length = 10)
    private String typeId;
    @Basic
    @Column(name = "type_name", nullable = true,columnDefinition = "NVARCHAR(255)")
    private String typeName;

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public ProductType() {
    }

    public ProductType(String typeId, String typeName) {
        this.typeId = typeId;
        this.typeName = typeName;
    }

    @OneToMany (mappedBy = "typeId")
    public List<Product> productList;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductType that = (ProductType) o;

        if (typeId != null ? !typeId.equals(that.typeId) : that.typeId != null) return false;
        if (typeName != null ? !typeName.equals(that.typeName) : that.typeName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = typeId != null ? typeId.hashCode() : 0;
        result = 31 * result + (typeName != null ? typeName.hashCode() : 0);
        return result;
    }
}
