package com.example.spring.practice.controller;

import com.example.spring.practice.ApiResponse;
import com.example.spring.practice.entity.Employee;
import com.example.spring.practice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/employee")
public class EmployeeDataController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/upload/details")
    public ResponseEntity<ApiResponse> uploadDate(@RequestBody Employee employee) {
        ApiResponse response = new ApiResponse();
        employeeService.saveEmployeeDetails(employee);
        response.setStatus("SUCCESS");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/findAllEmployee")
    public ResponseEntity<ApiResponse> findEmployee() {
        ApiResponse response = new ApiResponse();
        response.setData(employeeService.findAllEmployee());
        response.setStatus("SUCCESS");
        return new ResponseEntity<>(response,HttpStatus.OK);
    }

    @GetMapping("/findEmployee/{Id}")
    public ResponseEntity<ApiResponse> getEmployeeById(@PathVariable String id) {
        ApiResponse response = new ApiResponse();
        response.setData(employeeService.findEmployeeById(id));
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/delete/employee/{id}")
    public ResponseEntity<ApiResponse> deleteEmployee(@PathVariable String id) {
        ApiResponse response = new ApiResponse();
        employeeService.deleteEmployeeById(id);
        response.setStatus("SUCCESS");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/employeeCount")
    public ResponseEntity<ApiResponse> EmployeeCount() {
        ApiResponse response = new ApiResponse();
        response.setData(employeeService.findEmployeeCount());
        return new ResponseEntity(response,HttpStatus.OK);
    }
    @GetMapping("/findByEmail/{email}")
    public ResponseEntity<ApiResponse> getByEmployeeByEmail(@PathVariable String email){
        ApiResponse response = new ApiResponse();
        response.setData(employeeService.findEmployeeByEmail(email));
        return new ResponseEntity<>(response,HttpStatus.OK);
    }
}
