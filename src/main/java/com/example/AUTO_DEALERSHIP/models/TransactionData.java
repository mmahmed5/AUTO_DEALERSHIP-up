package com.example.AUTO_DEALERSHIP.models;


import javax.persistence.*;


@Entity
@Table(name="transactiondata")
public class TransactionData {
    @Id
    @Column(name="transactionsid")
    private String transactionsid;
    @Column(name="receipt")
    private String receipt;
    @Column(name="employeeid")
    private String employeeid;
    @Column(name = "customerid")
    private String customerid;
    @Column(name="vehicleid")
    private String vehicleid;

    public String getTransactionsid() {
        return transactionsid;
    }

    public void setTransactionsid(String transactionsid) {
        this.transactionsid = transactionsid;
    }

    public String getReceipt() {
        return receipt;
    }

    public void setReceipt(String receipt) {
        this.receipt = receipt;
    }

    public String getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid;
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    public String getVehicleid() {
        return vehicleid;
    }

    public void setVehicleid(String vehicleid) {
        this.vehicleid = vehicleid;
    }
}
