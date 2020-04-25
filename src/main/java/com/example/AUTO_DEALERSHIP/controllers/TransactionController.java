package com.example.AUTO_DEALERSHIP.controllers;

import com.example.AUTO_DEALERSHIP.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.persistence.Column;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.sql.*;
import java.util.Optional;


@Controller
public class TransactionController {
    @Autowired
    TransactionRepo transactionRepo;
    @Autowired
    EmployeeRepo employeeRepo;
    @Autowired
    CustomerRepo customerRepo;
    @Autowired
    VehicleRepo vehicleRepo;

    @RequestMapping("/transaction")
    public ModelAndView doHome(){
        ModelAndView mv = new ModelAndView("transaction");
        return mv;
    }
    @RequestMapping(value="/findtransaction", method = RequestMethod.POST)
    public ModelAndView retrieveTransaction(@RequestParam("receipt") String receipt){
        ModelAndView mv = new ModelAndView("transaction");
        String transactionsid = "";
        String employeeid = "";
        String vehicleid="";
        String customerid = "";
        System.out.println(receipt);
        try{
            final String AWS_URL = "jdbc:mysql://project-db.cgvtjh1lky56.us-east-1.rds.amazonaws.com:3306/project_db?user=admin&password=project2020"
                    +"?user=admin&password=project2020";
            Connection conn = DriverManager.getConnection(AWS_URL);
            Statement statement = conn.createStatement();
            String sql = "SELECT transactionsid,employeeid,customerid,vehicleid FROM project_db.transactiondata WHERE receipt LIKE \""
                    + receipt + "\"";
            ResultSet result = statement.executeQuery(sql);
            while(result.next()){
                transactionsid = result.getString("transactionsid");
                employeeid = result.getString("employeeid");
                vehicleid = result.getString("vehicleid");
                customerid = result.getString("customerid");
            }
            statement.close();
            conn.close();
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        Optional<TransactionData> transactionData = transactionRepo.findById(transactionsid);
        TransactionData transactionToMap = transactionData.get();
        mv.addObject("transactiondata", transactionToMap);

        Optional<EmployeeData> employeeData = employeeRepo.findById(employeeid);
        EmployeeData employeeToMap = employeeData.get();
        mv.addObject("employeedata",employeeToMap);


        Optional<CustomerData> customerData = customerRepo.findById(customerid);
        CustomerData customerToMap = customerData.get();
        mv.addObject("customerdata",customerToMap);


        Optional<VehicleData> vehicleData = vehicleRepo.findById(vehicleid);
        VehicleData vehicleToMap = vehicleData.get();
        mv.addObject("vehicledata",vehicleToMap);
    return mv;
    }


}
