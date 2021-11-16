package com.spring.restapi.service;

import com.spring.restapi.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    private static List<Employee> list = new ArrayList<>();
    static {
        Employee e = new Employee();
        e.setName("Giabao");
        e.setAge(28L);
        e.setDepartment("IT");
        e.setEmail("abc@gmail.com");
        e.setLocation("dn");
        list.add(e);

        e = new Employee();
        e.setName("Anhkhoa");
        e.setAge(21L);
        e.setDepartment("IT");
        e.setEmail("abc@gmail.com");
        e.setLocation("hue");
        list.add(e);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return list;
    }
}
