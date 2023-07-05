package com.welcome.Model;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "tbl.Bill", schema = "dbo", catalog = "demoweb")
public class Bill {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "bill_id", nullable = false)
    private int billId;
    @Basic
    @Column(name = "invoice_creation_date", nullable = true)
    private Timestamp invoiceCreationDate;
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = true)
    private Customer customer;
    @Basic
    @Column(name = "total_payment", nullable = true, length = 10)
    private String totalPayment;

    @OneToMany(mappedBy = "billId")
    private List<BillDetails> billDetailsListbyBill;

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public Timestamp getInvoiceCreationDate() {
        return invoiceCreationDate;
    }

    public void setInvoiceCreationDate(Timestamp invoiceCreationDate) {
        this.invoiceCreationDate = invoiceCreationDate;
    }

    public List<BillDetails> getBillDetailsListbyBill() {
        return billDetailsListbyBill;
    }

    public void setBillDetailsListbyBill(List<BillDetails> billDetailsListbyBill) {
        this.billDetailsListbyBill = billDetailsListbyBill;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(String totalPayment) {
        this.totalPayment = totalPayment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bill tblBill = (Bill) o;

        if (billId != tblBill.billId) return false;
        if (invoiceCreationDate != null ? !invoiceCreationDate.equals(tblBill.invoiceCreationDate) : tblBill.invoiceCreationDate != null)
            return false;
        if (customer != null ? !customer.equals(tblBill.customer) : tblBill.customer!= null) return false;
        if (totalPayment != null ? !totalPayment.equals(tblBill.totalPayment) : tblBill.totalPayment != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = billId;
        result = 31 * result + (invoiceCreationDate != null ? invoiceCreationDate.hashCode() : 0);
        result = 31 * result + (customer != null ? customer.hashCode() : 0);
        result = 31 * result + (totalPayment != null ? totalPayment.hashCode() : 0);
        return result;
    }
}
