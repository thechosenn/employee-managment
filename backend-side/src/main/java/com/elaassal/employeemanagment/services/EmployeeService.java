package com.elaassal.employeemanagment.services;

import com.elaassal.employeemanagment.dto.DepartmentResponse;
import com.elaassal.employeemanagment.dto.EmployeeRequest;
import com.elaassal.employeemanagment.dto.EmployeeResponse;
import com.elaassal.employeemanagment.entities.Department;
import com.elaassal.employeemanagment.repository.DepartmentRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import com.elaassal.employeemanagment.entities.Employee;
import com.elaassal.employeemanagment.exceptions.EmployeeException;
import com.elaassal.employeemanagment.interfaces.EmployeeInterface;
import com.elaassal.employeemanagment.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class EmployeeService implements EmployeeInterface {

    private final EmployeeRepository employeeRepository;

    private final DepartmentRepository departmentRepository;

    @Override
    public List<EmployeeResponse> findAllEmployee() {
        List<Employee> employees = employeeRepository.findAll();

        return employees.stream().map(this::mapToEmployeeResponse).toList();
    }

    @Override
    public Employee findEmployeeById(Long id) throws EmployeeException {
        return employeeRepository.findById(id).orElseThrow(()->new EmployeeException("Employee with "+id+"not found !"));
    }

    @Override
    public Employee findEmployeeByCin(String cin) throws EmployeeException {
        return employeeRepository.findByCin(cin).orElseThrow(()->new EmployeeException("Employee with "+cin+"not found !"));
    }

    @Override
    public List<Employee> findEmployeeByLastName(String lastname) throws EmployeeException {
        List<Employee> clients = employeeRepository.findAllByLastName(lastname);
        if(clients.isEmpty())
            throw new EmployeeException("Employee with lastname: "+lastname+" not found !");
        return clients;}

    @Override
    public EmployeeResponse  saveEmployee(EmployeeRequest employeeRequest) {
        Department dep = departmentRepository.findById(employeeRequest.getDepartmentId()).get();
        Employee employee = Employee.builder()
                .firstName(employeeRequest.getFirstName())
                .lastName(employeeRequest.getLastName())
                .cin(employeeRequest.getCin())
                .nationality(employeeRequest.getNationality())
                .department(dep)
                .build();
        employeeRepository.save(employee);
        log.info("Employee {} is saved", employee.getIdEmpl());
        return mapToEmployeeResponse(employee);
    }

    @Override
    public EmployeeResponse updateEmployee(EmployeeRequest employeeRequest, Long id)throws EmployeeException{

        Department dep = departmentRepository.findById(employeeRequest.getDepartmentId()).get();

        Employee employee = employeeRepository.findById(id).get();

        employee.setFirstName(employeeRequest.getFirstName());
        employee.setLastName(employeeRequest.getLastName());
        employee.setCin(employeeRequest.getCin());
        employee.setNationality(employeeRequest.getNationality());
        employee.setDepartment(dep);
        employeeRepository.save(employee);
        log.info("Employee {} is Updated Successfully", employee.getIdEmpl());
        return mapToEmployeeResponse(employee);
    }

    @Override
    public Employee deleteEmployeeById(Long id) throws EmployeeException {
        Employee employee=employeeRepository.findById(id).orElseThrow(()->new EmployeeException("Employee with "+id+"not found !"));
        employeeRepository.delete(employee);
        return employee;
    }

    private EmployeeResponse mapToEmployeeResponse(Employee employee) {
        return EmployeeResponse.builder()
                .idEmpl(employee.getIdEmpl())
                .firstName(employee.getFirstName())
                .lastName(employee.getLastName())
                .cin(employee.getCin())
                .department(new DepartmentResponse(employee.getDepartment().getDepartmentName()))
                .build();
    }
}
