package com.example.AUTO_DEALERSHIP.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="employeedata")
public class EmployeeData {
    @Id
    @Column(name="employeeid")
    private String employeeid;
    @Column(name="firstname")
    public String firstname;
    @Column(name="lastname")
    public String lastname;
    @Column(name="hiredate")
    public int hiredate;
    @Column(name="lastdate")
    public int lastdate;

    public EmployeeData(){

    }
    public EmployeeData (String employeeid, String firstname, String lastname, int hiredate, int lastdate)
    {
        this.employeeid = employeeid;
        this.firstname=firstname;
        this.lastname = lastname;
        this.hiredate = hiredate;
        this.lastdate = lastdate;
    }

    public String getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getHiredate() {
        return hiredate;
    }

    public void setHiredate(int hiredate) {
        this.hiredate = hiredate;
    }

    public int getLastdate() {
        return lastdate;
    }

    public void setLastdate(int lastdate) {
        this.lastdate = lastdate;
    }
}
