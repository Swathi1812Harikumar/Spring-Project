package com.example.spring.practice.entity;

import com.example.spring.practice.enums.Gender;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@JsonInclude(Include.NON_NULL)
@AllArgsConstructor
@Document
public class Employee {

    private static final String FIRST_NAME = "firstName";
    private static final String LAST_NAME = "lastName";
    private static final String EMAIL = "email";
    private static final String EMPLOYEE_ID = "empId";
    private static final String GENDER = "gender";
    private static final String ADDRESS = "address";
    private static final String EMPLOYEE_ROLE = "employee_role" ;
    private static final String CONTACT_NUMBER = "contact_number";

    @Id
    private String id;

    @Field(FIRST_NAME)
    private String firstName;

    @Field(LAST_NAME)
    private String lastName;

    @Field(EMAIL)
    private String email;

    @Field(EMPLOYEE_ID)
    private String empId;

    @Field(GENDER)
    private Gender gender;

    @Field(ADDRESS)
    private Address address;

    @Field(EMPLOYEE_ROLE)
    private String employeeRole;

    @Field(CONTACT_NUMBER)
    private String contactNumber;
}
