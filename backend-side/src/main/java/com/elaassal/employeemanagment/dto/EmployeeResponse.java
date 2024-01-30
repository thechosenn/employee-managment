package com.elaassal.employeemanagment.dto;

import com.elaassal.employeemanagment.entities.Department;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeResponse {

        private Long idEmpl;

        private String firstName;

        private String lastName;

        private String cin;

        private DepartmentResponse department;


    }


