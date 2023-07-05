package com.welcome.Model;

import jakarta.persistence.*;

import java.io.Serializable;
@Embeddable
public class BillDetailsPK implements Serializable {
    @Id
    @ManyToOne
    private Bill billId;
    @Id
    @ManyToOne
    private Product productId;

    public Bill getBillId() {
        return billId;
    }

    public void setBillId(Bill billId) {
        this.billId = billId;
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BillDetailsPK that = (BillDetailsPK) o;

        if (billId != that.billId) return false;
        if (productId != that.productId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
