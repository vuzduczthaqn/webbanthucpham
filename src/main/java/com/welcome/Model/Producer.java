package com.welcome.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tbl.Producer", schema = "dbo", catalog = "demoweb")
public class Producer {
    @Id
    @Column(name = "producer_id", nullable = false, length = 10)
    private String producerId;
    @Basic
    @Column(name = "producer_name", nullable = true, length = 50,columnDefinition = "NVARCHAR(255)")
    private String producerName;
    @Basic
    @Column(name = "address", nullable = true, length = 50,columnDefinition = "NVARCHAR(255)")
    private String address;
    @OneToMany(mappedBy = "producerId")
    private List<Product> productList;

    public Producer() {
    }

    public Producer(String producerId, String producerName, String address) {
        this.producerId = producerId;
        this.producerName = producerName;
        this.address = address;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public String getProducerId() {
        return producerId;
    }

    public void setProducerId(String producerId) {
        this.producerId = producerId;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Producer that = (Producer) o;

        if (producerId != null ? !producerId.equals(that.producerId) : that.producerId != null) return false;
        if (producerName != null ? !producerName.equals(that.producerName) : that.producerName != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = producerId != null ? producerId.hashCode() : 0;
        result = 31 * result + (producerName != null ? producerName.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }
}
