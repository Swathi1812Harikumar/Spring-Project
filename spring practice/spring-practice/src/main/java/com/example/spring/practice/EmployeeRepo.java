package com.example.spring.practice;

import com.example.spring.practice.entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends MongoRepository<Employee,String> {

    Employee findEmployeeById(String id);

    Employee findEmployeeByEmail(String email);

}
