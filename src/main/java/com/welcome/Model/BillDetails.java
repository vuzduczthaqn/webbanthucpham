package com.welcome.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl.Bill_details", schema = "dbo", catalog = "demoweb")
@IdClass(BillDetailsPK.class)
public class BillDetails {
    @Id
    @ManyToOne
    @JoinColumn(name = "bill_id")
    private Bill billId;
    @Id
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product productId;
    @Basic
    @Column(name = "unit_price", nullable = true, precision = 0)
    private Double unitPrice;
    @Basic
    @Column(name = "quantity", nullable = true)
    private Integer quantity;

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

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BillDetails that = (BillDetails) o;

        if (billId != that.billId) return false;
        if (productId != that.productId) return false;
        if (unitPrice != null ? !unitPrice.equals(that.unitPrice) : that.unitPrice != null) return false;
        if (quantity != null ? !quantity.equals(that.quantity) : that.quantity != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
