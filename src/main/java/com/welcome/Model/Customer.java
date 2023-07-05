package com.welcome.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tbl.Customer", schema = "dbo", catalog = "demoweb")
public class Customer {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "customer_id", nullable = false)
    private int customerId;
    @Basic
    @Column(name = "customer_name", nullable = true,columnDefinition = "NVARCHAR(255)")
    private String customerName;
    @Basic
    @Column(name = "age", nullable = true)
    private Integer age;
    @Basic
    @Column(name = "email", nullable = true,columnDefinition = "NVARCHAR(255)")
    private String email;
    @OneToOne(mappedBy = "customerId")
    private User userId;
    @OneToMany(mappedBy = "customerId")
    private List<Cart> cartListbyCutomer;
    @OneToMany(mappedBy = "customer")
    private List<Bill> billList;
    @OneToMany(mappedBy = "customer")
    private List<DeliveryAddress> deliveryAddressList;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer that = (Customer) o;

        if (customerId != that.customerId) return false;
        if (customerName != null ? !customerName.equals(that.customerName) : that.customerName != null) return false;
        if (age != null ? !age.equals(that.age) : that.age != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = customerId;
        result = 31 * result + (customerName != null ? customerName.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }
}
