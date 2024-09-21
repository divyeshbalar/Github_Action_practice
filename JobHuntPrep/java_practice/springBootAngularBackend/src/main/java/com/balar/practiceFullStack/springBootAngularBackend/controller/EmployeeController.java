package com.balar.practiceFullStack.springBootAngularBackend.controller;

import com.balar.practiceFullStack.springBootAngularBackend.entity.Employees;
import com.balar.practiceFullStack.springBootAngularBackend.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
    private final EmployeeRepository employeeRepo;


    public EmployeeController(EmployeeRepository employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @GetMapping("/employees")
    public List<Employees> getAllEmployee(){
        return this.employeeRepo.findAll();
    }
}
