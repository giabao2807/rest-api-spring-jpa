package com.spring.restapi.controller;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpMethod.*;

@RestController //@controller + RequestBody
public class EmployeeController {

    //localhost:8080/employees
    @RequestMapping(value= "/employees", method = RequestMethod.GET)
    @ResponseBody
    public String getEmployee(){
        return "displying the list of employees";
    }


}
