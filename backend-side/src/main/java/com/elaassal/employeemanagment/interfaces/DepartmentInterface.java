package com.elaassal.employeemanagment.interfaces;

import com.elaassal.employeemanagment.dto.DepartmentRequest;
import com.elaassal.employeemanagment.entities.Department;

import java.util.List;

public interface DepartmentInterface {

    List<Department> findAllDepartment();

    void  saveDepartment(DepartmentRequest departmentRequest);
}
