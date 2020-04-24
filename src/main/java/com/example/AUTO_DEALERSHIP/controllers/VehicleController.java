package com.example.AUTO_DEALERSHIP.controllers;

import com.example.AUTO_DEALERSHIP.models.VehicleData;
import com.example.AUTO_DEALERSHIP.models.VehicleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.UUID;
@Controller
public class VehicleController {
    @Autowired
    VehicleRepo vehicleRepo;

    @RequestMapping("/")
    public ModelAndView doHome() {
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("vehiclelist", vehicleRepo.findAll());
        return mv;
    }

    @RequestMapping(value = "/view/{vehicleid}", method = RequestMethod.GET)
    public ModelAndView view(@PathVariable("vehicleid") String vehicleid) {
        ModelAndView mv = new ModelAndView("view");
        Optional<VehicleData> vehicle = vehicleRepo.findById(vehicleid);
        VehicleData vehicleToMap = vehicle.get();
        mv.addObject("selectedItem", vehicleToMap);
        return mv;
    }

    @RequestMapping(value = "/edit/{vehicleid}", method = RequestMethod.GET)
    public ModelAndView edit(@PathVariable("vehicleid") String vehicleid){
        ModelAndView mv = new ModelAndView("edit");
        Optional<VehicleData> vehicle = vehicleRepo.findById(vehicleid);
        VehicleData vehicleToMap = vehicle.get();
        mv.addObject("selecteditem",vehicleToMap);
        return mv;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView save(@RequestParam ("vehicleid") String vehicleid, @RequestParam("vehiclemake") String vehiclemake, @RequestParam ("vehiclemodel") String vehiclemodel,
                            @RequestParam ("vehicleyear") int vehicleyear, @RequestParam ("vehiclevin") String vehiclevin, @RequestParam ("vehiclecolor") String vehiclecolor,
                            @RequestParam ("vehiclemileage") int vehiclemileage,@RequestParam ("vehicleprice") int vehicleprice, @RequestParam("vehicleavail") boolean vehicleavail){
            ModelAndView mv = new ModelAndView("redirect/");
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
            vehicleToSave.setVehicleavail(vehicleavail);
            vehicleRepo.save(vehicleToSave);
            mv.addObject("vehiclelist",vehicleRepo.findAll());
            return mv;

    }
    @RequestMapping (value="/delete/", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable("vehicleid") String vehicleid){
        ModelAndView mv = new ModelAndView("redirect:/");
        vehicleRepo.deleteById(vehicleid);
        return mv;
    }

}
