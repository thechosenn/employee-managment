package com.elaassal.employeemanagment;

import com.elaassal.employeemanagment.entities.Employee;
import com.elaassal.employeemanagment.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeManagmentApplication {
	@Autowired
	EmployeeRepository empl;

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagmentApplication.class, args);

	}



}
