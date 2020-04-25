package com.example.AUTO_DEALERSHIP.controllers;

import com.example.AUTO_DEALERSHIP.models.EmployeeRepo;
import com.example.AUTO_DEALERSHIP.models.VehicleData;
import com.example.AUTO_DEALERSHIP.models.VehicleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.UUID;

@Controller
public class VehicleController {
    @Autowired
    VehicleRepo vehicleRepo;
    @RequestMapping("/vehicle")
    public ModelAndView doHome() {
        ModelAndView mv = new ModelAndView("vehicle");
        mv.addObject("vehiclelist", vehicleRepo.findAll());
        return mv;
    }


    @RequestMapping( value = "/vehicleview/{vehicleid}", method = RequestMethod.GET)
    public ModelAndView view(@PathVariable("vehicleid") String vehicleid){
        ModelAndView mv = new ModelAndView("vehicleview");
        Optional<VehicleData> person = vehicleRepo.findById(vehicleid);
        VehicleData vehicleToMap = person.get();
        mv.addObject("selectedItem", vehicleToMap);
        return mv;
    }


    @RequestMapping(value = "/vehicle-save", method = RequestMethod.POST)
    public ModelAndView save(@RequestParam ("vehicleid") String vehicleid, @RequestParam("vehiclemake") String vehiclemake, @RequestParam ("vehiclemodel") String vehiclemodel,
                            @RequestParam ("vehicleyear") int vehicleyear, @RequestParam ("vehiclevin") String vehiclevin, @RequestParam ("vehiclecolor") String vehiclecolor,
                            @RequestParam ("vehiclemileage") int vehiclemileage,@RequestParam ("vehicleprice") int vehicleprice) {
            ModelAndView mv = new ModelAndView("redirect:/vehicle");
            VehicleData vehicleToSave;
            if(!vehicleid.isEmpty()){
                Optional<VehicleData> users = vehicleRepo.findById(vehicleid);
                vehicleToSave = users.get();
        }
            else {
                vehicleToSave = new VehicleData();
                vehicleToSave.setVehicleid(UUID.randomUUID().toString());
            }
            vehicleToSave.setVehiclemake(vehiclemake);
            vehicleToSave.setVehiclemodel(vehiclemodel);
            vehicleToSave.setVehicleyear(vehicleyear);
            vehicleToSave.setVehiclevin(vehiclevin);
            vehicleToSave.setVehiclecolor(vehiclecolor);
            vehicleToSave.setVehiclemileage(vehiclemileage);
            vehicleToSave.setVehicleprice(vehicleprice);

            vehicleRepo.save(vehicleToSave);
            mv.addObject("vehiclelist",vehicleRepo.findAll());
            return mv;

    }
    @RequestMapping (value="/vehicle-delete/", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable("vehicleid") String vehicleid){
        ModelAndView mv = new ModelAndView("redirect:/");
        vehicleRepo.deleteById(vehicleid);
        return mv;
    }

}
