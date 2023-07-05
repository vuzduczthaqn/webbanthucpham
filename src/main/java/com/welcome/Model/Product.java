package com.welcome.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tbl.Product", schema = "dbo", catalog = "demoweb")
public class Product {
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
    private ProductType typeId;
   @ManyToOne
    @JoinColumn(name = "producer_id", nullable = true)
    private Producer producerId;

   @OneToMany(mappedBy = "productId")
   private List<Cart> cartListByProduct;

    public Producer getProducerId() {
        return producerId;
    }

    public void setProducerId(Producer producerId) {
        this.producerId = producerId;
    }

    @OneToMany(mappedBy = "productId")
   private List<BillDetails> billDetailsList;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPathImg() {
        return pathImg;
    }

    public void setPathImg(String pathImg) {
        this.pathImg = pathImg;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(Double evaluate) {
        this.evaluate = evaluate;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ProductType getTypeId() {
        return typeId;
    }

    public void setTypeId(ProductType typeId) {
        this.typeId = typeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product that = (Product) o;

        if (productId != that.productId) return false;
        if (productName != null ? !productName.equals(that.productName) : that.productName != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (pathImg != null ? !pathImg.equals(that.pathImg) : that.pathImg != null) return false;
        if (weight != null ? !weight.equals(that.weight) : that.weight != null) return false;
        if (evaluate != null ? !evaluate.equals(that.evaluate) : that.evaluate != null) return false;
        if (describe != null ? !describe.equals(that.describe) : that.describe != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (typeId != null ? !typeId.equals(that.typeId) : that.typeId != null) return false;
        if (producerId != null ? !producerId.equals(that.producerId) : that.producerId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productId;
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (pathImg != null ? pathImg.hashCode() : 0);
        result = 31 * result + (weight != null ? weight.hashCode() : 0);
        result = 31 * result + (evaluate != null ? evaluate.hashCode() : 0);
        result = 31 * result + (describe != null ? describe.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (typeId != null ? typeId.hashCode() : 0);
        result = 31 * result + (producerId != null ? producerId.hashCode() : 0);
        return result;
    }
}
