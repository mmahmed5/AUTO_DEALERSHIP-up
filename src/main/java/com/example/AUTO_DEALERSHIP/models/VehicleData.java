package com.example.AUTO_DEALERSHIP.models;
import javax.persistence.*;

@Entity
@Table(name="vehicledata")
public class VehicleData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="vehicleid")
    private Long vehicleid;
    @Column(name = "vehiclemake")
    public String vehiclemake;
    @Column(name = "vehiclemodel")
    public String vehiclemodel;
    @Column(name = "vehicleyear")
    public int vehicleyear;
    @Column(name = "vehiclevin")
    public String vehiclevin;
    @Column(name = "vehiclecolor")
    public String vehiclecolor;
    @Column(name = "vehiclemileage")
    public int vehiclemileage;
    @Column(name = "vehicleprice")
    public int vehicleprice;
    @Column(name = "vehicleavail")
    public boolean vehicleavail;

    public VehicleData() {
    }

    public VehicleData(String vehicleid, String vehiclemake, String vehiclemodel, int vehicleyear,
                       String vehiclevin, String vehiclecolor, int vehiclemileage, int vehicleprice, boolean vehicleavail) {
        this.vehicleid = vehicleid;
        this.vehiclemake = vehiclemake;
        this.vehiclemodel = vehiclemodel;
        this.vehicleyear = vehicleyear;
        this.vehiclevin = vehiclevin;
        this.vehiclecolor = vehiclecolor;
        this.vehiclemileage = vehiclemileage;
        this.vehicleprice = vehicleprice;
        this.vehicleavail = vehicleavail;
    }


    public String  getVehicleid() {
        return vehicleid;
    }

    public void setVehicleid(String vehicleid) {
        this.vehicleid = vehicleid;
    }

    public String getVehiclemake() {
        return vehiclemake;
    }

    public void setVehiclemake(String vehiclemake) {
        this.vehiclemake = vehiclemake;
    }

    public String getVehiclemodel() {
        return vehiclemodel;
    }

    public void setVehiclemodel(String vehiclemodel) {
        this.vehiclemodel = vehiclemodel;
    }

    public int getVehicleyear() {
        return vehicleyear;
    }

    public void setVehicleyear(int vehicleyear) {
        this.vehicleyear = vehicleyear;
    }

    public String getVehiclevin() {
        return vehiclevin;
    }

    public void setVehiclevin(String vehiclevin) {
        this.vehiclevin = vehiclevin;
    }

    public String getVehiclecolor() {
        return vehiclecolor;
    }

    public void setVehiclecolor(String vehiclecolor) {
        this.vehiclecolor = vehiclecolor;
    }

    public int getVehiclemileage() {
        return vehiclemileage;
    }

    public void setVehiclemileage(int vehiclemileage) {
        this.vehiclemileage = vehiclemileage;
    }

    public int getVehicleprice() {
        return vehicleprice;
    }

    public void setVehicleprice(int vehicleprice) {
        this.vehicleprice = vehicleprice;
    }

    public boolean isVehicleavail() {
        return vehicleavail;
    }

    public void setVehicleavail(boolean vehicleavail) {
        this.vehicleavail = vehicleavail;
    }

    @Override
    public String toString() {
        return "Employee [vehicleid=" +  vehicleid + ", vehiclemake=" + vehiclemake + ", vehiclemodel=" + vehiclemodel + ", vehicleyear=" + vehicleyear + ", vehiclevin="
                + vehiclevin + ", vehiclecolor=" + vehiclecolor + ", vehiclemileage=" + vehiclemileage + ", vehiclemodel=" + vehiclemodel"]";


}
