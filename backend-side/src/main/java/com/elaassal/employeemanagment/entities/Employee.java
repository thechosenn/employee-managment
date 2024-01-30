package com.elaassal.employeemanagment.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "tbl_emlpoyee")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long idEmpl;
        @Column(nullable = false)
        private String firstName;
        @Column(nullable = false)
        private String lastName;
        @Column(unique = true,nullable = false)
        private String cin;
        @Column(nullable = false)
        private String nationality;
        @ManyToOne
        @JoinColumn(name = "idDept")
        private Department department;



}
