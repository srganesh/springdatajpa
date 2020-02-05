package com.gsragavan.spring.datajpa.controller;

import com.gsragavan.spring.datajpa.entity.Employee;
import com.gsragavan.spring.datajpa.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SimpleController {

    private EmployeeService employeeService;

    @Autowired
    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    @PostMapping(value = "/employees",consumes = "application/json")
    public Employee getEmployees(@RequestBody Employee employee) {
        return employeeService.createOrUpdateEmployee(employee);
    }
}
