package com.welcome.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl.Cart", schema = "dbo", catalog = "demoweb")
@IdClass(CartPK.class)
public class Cart {
    @Id
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customerId;
    @Id
    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product productId;
    @Basic
    @Column(name = "quantity", nullable = true)
    private Integer quantity;
    @Basic
    @Column(name = "payment", nullable = true, precision = 0)
    private Double payment;

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPayment() {
        return payment;
    }

    public void setPayment(Double payment) {
        this.payment = payment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cart tblCart = (Cart) o;

        if (customerId != tblCart.customerId) return false;
        if (productId != tblCart.productId) return false;
        if (quantity != null ? !quantity.equals(tblCart.quantity) : tblCart.quantity != null) return false;
        if (payment != null ? !payment.equals(tblCart.payment) : tblCart.payment != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
