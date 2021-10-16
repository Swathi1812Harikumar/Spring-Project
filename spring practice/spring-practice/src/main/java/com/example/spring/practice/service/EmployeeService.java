package com.example.spring.practice.service;

import com.example.spring.practice.entity.Employee;
import java.util.List;

public interface EmployeeService {
     Employee findEmployeeById(String employeeId);

     List<Employee> findAllEmployee();

     void saveEmployeeDetails(Employee employee);

     void deleteEmployeeById(String id);

     long findEmployeeCount();

     Employee findEmployeeByEmail(String email);

}


