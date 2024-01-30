package com.elaassal.employeemanagment.repository;

import com.elaassal.employeemanagment.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Optional<Employee> findByCin(String cin);
    boolean existsByCin(String uniqueFieldValue);
    List<Employee> findAllByLastName(String lastname);
}
