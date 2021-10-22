package com.javamapper.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javamapper.beans.Employee;

@RestController
@RequestMapping("/emp")
public class EmployeeController 
{
   @RequestMapping("/all")
    public List<Employee> getEmployees() 
    {
      List<Employee> employeesList = new ArrayList<>();
      employeesList.add(new Employee(1,"Anil","kumar","anilwind47@gmail.com"));
      return employeesList;
    }
}