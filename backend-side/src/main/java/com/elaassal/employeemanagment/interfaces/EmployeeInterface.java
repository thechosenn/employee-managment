package com.elaassal.employeemanagment.interfaces;

import com.elaassal.employeemanagment.dto.EmployeeRequest;
import com.elaassal.employeemanagment.dto.EmployeeResponse;
import com.elaassal.employeemanagment.entities.Employee;
import com.elaassal.employeemanagment.exceptions.EmployeeException;

import java.util.List;

public interface EmployeeInterface {
    List<EmployeeResponse> findAllEmployee();

    Employee findEmployeeById(Long id) throws EmployeeException;

    Employee findEmployeeByCin(String cin) throws EmployeeException;

    List<Employee> findEmployeeByLastName(String lastname) throws EmployeeException;

    EmployeeResponse  saveEmployee(EmployeeRequest employeeRequest);

    EmployeeResponse updateEmployee(EmployeeRequest employeeRequest, Long id) throws EmployeeException;

    Employee deleteEmployeeById(Long id) throws EmployeeException;
}
