package com.elaassal.employeemanagment.controllers;


import com.elaassal.employeemanagment.dto.EmployeeRequest;
import com.elaassal.employeemanagment.dto.EmployeeResponse;
import com.elaassal.employeemanagment.entities.Employee;
import com.elaassal.employeemanagment.services.EmployeeService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/Employee")
@CrossOrigin(origins = "http://localhost:3000")
public class EmpoyeeController {


    private final EmployeeService employeeService;

    @GetMapping("/AllEmployees")
    @ResponseStatus(HttpStatus.OK)
    public List<EmployeeResponse> getAllEmployees() {
        return employeeService.findAllEmployee();
    }

    @PostMapping("/employee")
    @ResponseStatus(HttpStatus.CREATED)
    public EmployeeResponse saveEmployee(@RequestBody EmployeeRequest empl){
       return employeeService.saveEmployee(empl);
    }
    @SneakyThrows
    @DeleteMapping(value = "/delete/{id}")
    public Employee deleteEmployee(@PathVariable(name = "id") Long id){
        return employeeService.deleteEmployeeById(id);
    }

    @SneakyThrows
    @PutMapping(value = "/update/{id}")
    @ResponseStatus(HttpStatus.OK)
    public EmployeeResponse updateEmployee(@RequestBody EmployeeRequest empl,@PathVariable(name = "id") Long id){
        return employeeService.updateEmployee(empl, id);
    }

}
