package com.example.AUTO_DEALERSHIP.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="employeedata")
public class EmployeeData {
    @Id
    @Column(name="employeeid")
    private String employeeid;
    @Column(name="employeefirstname")
    public String employeefirstname;
    @Column(name="employeelastname")
    public String employeelastname;
    @Column(name="employeehiredate")
    public int employeehiredate;
    @Column(name="employeelastdate")
    public int employeelastdate;

    public EmployeeData(){

    }
    public EmployeeData (String employeeid, String employeefirstname, String employeelastname, int employeehiredate,
                         int employeelastdate)
    {
        this.employeeid = employeeid;
        this.employeefirstname=employeefirstname;
        this.employeelastname = employeelastname;
        this.employeehiredate = employeehiredate;
        this.employeelastdate = employeelastdate;
    }

    public String getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid;
    }

    public String getEmployeefirstname() {
        return employeefirstname;
    }

    public void setEmployeefirstname(String employeefirstname) {
        this.employeefirstname = employeefirstname;
    }

    public String getEmployeelastname() {
        return employeelastname;
    }

    public void setEmployeelastname(String employeelastname) {
        this.employeelastname = employeelastname;
    }

    public int getEmployeehiredate() {
        return employeehiredate;
    }

    public void setEmployeehiredate(int employeehiredate) {
        this.employeehiredate = employeehiredate;
    }

    public int getEmployeelastdate() {
        return employeelastdate;
    }

    public void setEmployeelastdate(int employeelastdate) {
        this.employeelastdate = employeelastdate;
    }
}
