package com.example.AUTO_DEALERSHIP.models;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="customerdata")

public class CustomerData {
    @Id
    @Column(name="customerid")
   private String customerid;
    @Column(name="customerfirstname")
    public String customerfirstname;
    @Column(name="customerlastname")
    public String customerlastname;
    @Column(name="purchasedmake")
    public String purchasedmake;
    @Column(name="purchasedmodel")
    public String purchasedmodel;
    @Column(name="datepurchased")
    public int datepurchased;
    @Column(name="salesperson")
    public String salesperson;
    
    public CustomerData(){

    }
    public CustomerData (String customerid, String customerfirstname, String customerlastname, String purchasedmake, String purchasedmodel,
                         int datepurchased, String salesperson)
    {
        this.customerid = customerid;
        this.customerfirstname = customerfirstname;
        this.customerlastname = customerlastname;
        this.purchasedmake = purchasedmake;
        this.purchasedmodel = purchasedmodel;
        this.datepurchased = datepurchased;
        this.salesperson = salesperson;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    public void setCustomerfirstname(String customerfirstname) {
        this.customerfirstname = customerfirstname;
    }

    public void setCustomerlastname(String customerlastname) {
        this.customerlastname = customerlastname;
    }

    public void setPurchasedmake(String purchasedmake) {
        this.purchasedmake = purchasedmake;
    }

    public void setPurchasedmodel(String purchasedmodel) {
        this.purchasedmodel = purchasedmodel;
    }

    public void setDatepurchased(int datepurchased) {
        this.datepurchased = datepurchased;
    }

    public void setSalesperson(String salesperson) {
        this.salesperson = salesperson;
    }

    public String getCustomerid() {
        return customerid;
    }

    public String getCustomerfirstname() {
        return customerfirstname;
    }

    public String getCustomerlastname() {
        return customerlastname;
    }

    public String getPurchasedmake() {
        return purchasedmake;
    }

    public String getPurchasedmodel() {
        return purchasedmodel;
    }

    public int getDatepurchased() {
        return datepurchased;
    }

    public String getSalesperson() {
        return salesperson;
    }
}


