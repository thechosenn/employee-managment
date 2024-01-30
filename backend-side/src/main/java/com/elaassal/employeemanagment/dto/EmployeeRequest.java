package com.elaassal.employeemanagment.dto;

import com.elaassal.employeemanagment.entities.Department;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeRequest {

    private String firstName;

    private String lastName;

    private String cin;

    private String nationality;

    private Long departmentId;

    public String getUniqueFieldCin() {
        return this.cin;
    }

    // Setter for the unique field
    public void setUniqueFieldCin(String uniqueFieldValue) {
        this.cin = uniqueFieldValue;
    }
}
