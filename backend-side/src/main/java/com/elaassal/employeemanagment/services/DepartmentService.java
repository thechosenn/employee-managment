package com.elaassal.employeemanagment.services;

import com.elaassal.employeemanagment.dto.DepartmentRequest;
import com.elaassal.employeemanagment.entities.Department;
import com.elaassal.employeemanagment.interfaces.DepartmentInterface;
import com.elaassal.employeemanagment.repository.DepartmentRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class DepartmentService implements DepartmentInterface {

    private final DepartmentRepository departmentRepository;
    @Override
    public List<Department> findAllDepartment() {
        return departmentRepository.findAll();
    }

    @Override
    public void saveDepartment(DepartmentRequest departmentRequest) {
        Department department = Department.builder()
                .departmentName(departmentRequest.getDepartmentName())
                .build();
        departmentRepository.save(department);
        log.info("Department {} is saved", department.getIdDept());

    }
}
