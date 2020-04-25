package com.example.AUTO_DEALERSHIP.controllers;

import com.example.AUTO_DEALERSHIP.models.CustomerData;
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
public class IndexController {

    @RequestMapping("/")
    public ModelAndView doHome() {
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }


    @RequestMapping( value = "/indexview/{indexid}", method = RequestMethod.GET)
    public ModelAndView view(@PathVariable("indexid") String indexid) {
        ModelAndView mv = new ModelAndView("indexview");

        return mv;
    }

}





