package com.welcome.Model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;
@Embeddable
public class CartPK implements Serializable {

    @ManyToOne
    @Id
    private Customer customerId;
    @ManyToOne
    @Id
    private Product productId;




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CartPK cartPK = (CartPK) o;

        if (customerId != cartPK.customerId) return false;
        if (productId != cartPK.productId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, productId);
    }

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
}
