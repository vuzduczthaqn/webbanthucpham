package com.welcome.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl.Delivery_Address", schema = "dbo", catalog = "demoweb")
public class DeliveryAddress {
    @Id
    @Basic
    @Column(name = "address_id", nullable = true)
    private Integer addressId;
    @Column(columnDefinition = "nvarchar(255)")
    private String address;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    public Integer getAddressId() {
        return addressId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    @Basic
    @Column(name = "number_phone", nullable = true, length = 10)
    private String numberPhone;
    public Customer getCostomer() {
        return customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public void setCostomer(Customer costomer) {
        this.customer = costomer;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeliveryAddress that = (DeliveryAddress) o;

        if (addressId != null ? !addressId.equals(that.addressId) : that.addressId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = addressId != null ? addressId.hashCode() : 0;
        return result;
    }
}
