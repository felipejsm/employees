package com.nssp.employees.data.models;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "dept_manager")
@Data
public class DeptManager implements Serializable {
    @EmbeddedId
    private DepEmpIds depEmpIds;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("employeeId")
    private Employees employees;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("dept_no")
    private Departments departments;

    @Column(name = "from_date")
    private LocalDate fromDate;

    @Column(name = "to_date")
    private LocalDate toDate;

}
