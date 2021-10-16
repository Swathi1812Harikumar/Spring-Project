package com.example.spring.practice.service;

import com.example.spring.practice.EmployeeRepo;
import com.example.spring.practice.entity.Employee;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public Employee findEmployeeById(String employeeId) {
        return employeeRepo.findEmployeeById(employeeId);
    }

    @Override
    public List<Employee> findAllEmployee() {
        return employeeRepo.findAll();
    }

    @Override
    public void saveEmployeeDetails(Employee employee) {
        employeeRepo.save(employee);
    }

    @Override
    public void deleteEmployeeById(String id) {
         employeeRepo.deleteById(id);
    }

    @Override
    public long findEmployeeCount() {
        return employeeRepo.count();
    }

    @Override
    public Employee findEmployeeByEmail(String email) {
        return employeeRepo.findEmployeeByEmail(email);
    }
}
