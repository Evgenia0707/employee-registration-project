package com.cydeo.controller;

import com.cydeo.bootstrap.DataGenerator;
import com.cydeo.model.Employee;
import com.cydeo.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;//dependency injection

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping("/register")  //http://localhost:8080/employee/register
    public String createEmployee(Model model) {//use for get page

        model.addAttribute("employee", new Employee());
        model.addAttribute("stateList", DataGenerator.getAllStates());

        return "employee/employee-create";//html what we show to user
    }

    @PostMapping("/insert")
    public String insertEmployee(@ModelAttribute("employee") Employee employee) {//catch obj employee send from UI
        employeeService.saveEmployee(employee);//save obj employee

        return "redirect:employee/list";//with redirect, we are using endpoints //return page with all employee

    }

    @GetMapping("/list")
    public String listEmployees(Model model) {
        model.addAttribute("employeeList", employeeService.readAllEmployee());//carrying data  to view
        return "employee/employee-list";//(show to user) //without redirect, we are using html file point
    }
}
