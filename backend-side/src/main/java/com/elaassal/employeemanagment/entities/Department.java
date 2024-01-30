package com.elaassal.employeemanagment.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "tbl_department")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDept;

    private String departmentName;
    @Transient
    @OneToMany(mappedBy = "cin")
    private List<Employee> employees;
}
