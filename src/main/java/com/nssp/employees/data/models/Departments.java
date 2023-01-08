package com.nssp.employees.data.models;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.NaturalId;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Departments implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(
            mappedBy = "departments",
            orphanRemoval = true,
            cascade = CascadeType.ALL
    )
    private List<DeptEmp> departmentEmployees = new ArrayList<>();

    @Column(name = "dept_no")
    @NaturalId
    private String departmentNumber;
    @Column(name = "dept_name")
    private String departmentName;
}
