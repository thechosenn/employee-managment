package com.elaassal.employeemanagment.controllers;

import com.elaassal.employeemanagment.dto.DepartmentRequest;
import com.elaassal.employeemanagment.entities.Department;
import com.elaassal.employeemanagment.services.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/Department")
@CrossOrigin(origins = "http://localhost:3000/")
public class DepartmentController {

    private final DepartmentService departmentService;

    @GetMapping("/AllDepartment/")
    @ResponseStatus(HttpStatus.OK)
    public List<Department> getAllDepartment(){
        return departmentService.findAllDepartment();
    }

    @PostMapping("/department")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveDepartment(@RequestBody DepartmentRequest deptReq){
        departmentService.saveDepartment(deptReq);
    }
}
