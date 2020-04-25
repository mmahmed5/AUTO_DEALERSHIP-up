package com.example.AUTO_DEALERSHIP.controllers;

import com.example.AUTO_DEALERSHIP.models.CustomerData;
import com.example.AUTO_DEALERSHIP.models.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;
import java.util.UUID;

@Controller
public class CustomerController {
    @Autowired
    CustomerRepo customerRepo;

    @RequestMapping("/customer")
    public ModelAndView doHome() {
        ModelAndView mv = new ModelAndView("customer");
        mv.addObject("customerlist", customerRepo.findAll());
        return mv;
    }
    @RequestMapping(value = "/save-customer", method = RequestMethod.POST)
    public ModelAndView save(@RequestParam("customerid") String Customerid, @RequestParam("customerfirstname") String Customerfirstname, @RequestParam("customerlastname") String Customerlastname,
                             @RequestParam("purchasedmake") String Purchasedmake, @RequestParam("purchasedmodel") String Purchasedmodel, @RequestParam("datepurchased") int Datepurchased,
                             @RequestParam("salesperson") String Salesperson){
        ModelAndView mv = new ModelAndView("redirect:/customer");
        CustomerData customerToSave;
        if(!Customerid.isEmpty()){
            Optional<CustomerData> customer = customerRepo.findById(Customerid);

            customerToSave =customer.get();

        }
        else {
            customerToSave = new CustomerData();
            customerToSave.setCustomerid(UUID.randomUUID().toString());
        }
        customerToSave.setCustomerid(Customerid);
        customerToSave.setCustomerfirstname(Customerfirstname);
        customerToSave.setCustomerlastname(Customerlastname);
        customerToSave.setPurchasedmake(Purchasedmake);
        customerToSave.setPurchasedmodel(Purchasedmodel);
        customerToSave.setDatepurchased(Datepurchased);
        customerToSave.setSalesperson(Salesperson);

        customerRepo.save(customerToSave);
        mv.addObject("customerlist",customerRepo.findAll());
        return mv;
    }

}


