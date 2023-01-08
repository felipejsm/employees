package com.nssp.employees.data.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.time.LocalDate;

@Embeddable
@Data
public class DepEmpIds {

    @Column(name = "emp_no")
    private Long employeeId;

    @Column(name = "dept_no")
    private String departmentId;

}
