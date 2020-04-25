package com.example.AUTO_DEALERSHIP.controllers;


import com.example.AUTO_DEALERSHIP.models.EmployeeData;
import com.example.AUTO_DEALERSHIP.models.EmployeeRepo;
import com.example.AUTO_DEALERSHIP.models.VehicleData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import java.util.Optional;
import java.util.UUID;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeRepo employeeRepo;
    @RequestMapping("/employee")
    public ModelAndView doHome() {
        ModelAndView mv = new ModelAndView("employee");
        mv.addObject("employeelist", employeeRepo.findAll());
        return mv;
    }

    @RequestMapping( value = "/employeeview/{employeeid}", method = RequestMethod.GET)
    public ModelAndView view(@PathVariable("employeeid") String employeeid){
        ModelAndView mv = new ModelAndView("employeeview");
        Optional<EmployeeData> person = employeeRepo.findById(employeeid);
        EmployeeData employeeToMap = person.get();
        mv.addObject("selectedItem", employeeToMap);
        return mv;
    }
    @RequestMapping(value = "/save-employee", method = RequestMethod.POST)
    public ModelAndView save(@RequestParam("employeeid") String Employeeid, @RequestParam ("employeefirstname")
                            String Employeefirstname, @RequestParam("employeelastname") String Employeelastname,
                             @RequestParam("employeehiredate") int Employeehiredate, @RequestParam ("employeelastdate") int Employeelastdate){
        ModelAndView mv = new ModelAndView("redirect:/employee");
        EmployeeData employeeToSave;
        if(!Employeeid.isEmpty()){
            Optional<EmployeeData>employee = employeeRepo.findById(Employeeid);
            employeeToSave =employee.get();
        }
        else {
            employeeToSave = new EmployeeData();
            employeeToSave.setEmployeeid(UUID.randomUUID().toString());
        }
        employeeToSave.setEmployeeid(Employeeid);
        employeeToSave.setEmployeefirstname(Employeefirstname);
        employeeToSave.setEmployeelastname(Employeelastname);
        employeeToSave.setEmployeehiredate(Employeehiredate);
        employeeToSave.setEmployeelastdate(Employeelastdate);

        employeeRepo.save(employeeToSave);
        mv.addObject("employeelist",employeeRepo.findAll());
        return mv;
    }

    @RequestMapping (value="/employee-delete/{employeeid}", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable("employeeid") String employeeid){
        ModelAndView mv = new ModelAndView("redirect:/employee");
        employeeRepo.deleteById(employeeid);
        return mv;


    }

}
