package com.spring.restapi.controller;

import com.spring.restapi.model.Employee;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpMethod.*;

@RestController //@controller + RequestBody
public class EmployeeController {

    //localhost:8080/employees
    @GetMapping("/employees")
    public String getEmployees(){

        return "displying the list of employees";
    }

    @GetMapping("/employees/{id}")
    public String getEmployee(@PathVariable Long id){
        return "Fetching the employee details for the id "+ id;
    }
    @PostMapping("/employees")
    public String saveEmployee(@RequestBody Employee employee) {
        return "saving the employee details to the database" + employee;
    }

    @PutMapping("/employees/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee){
        System.out.println("update the employee data for the id" + id);
        return employee;
    }

    @DeleteMapping("/employees")
    public String deleteEmployee(@RequestParam("id") Long id){
        return "deleting the employee detail has id: " +id;
    }

}
