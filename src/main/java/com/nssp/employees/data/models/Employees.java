package com.nssp.employees.data.models;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Employees implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_no")
    private Long id;

    @Column(name = "birth_date")
    private LocalDate birthDate;
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Enumerated(EnumType.STRING)
    private GENDER gender;

    @Column(name = "hire_date")
    private LocalDate hireDate;

    @OneToMany(
            mappedBy = "employees",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Titles> titles = new ArrayList<>();

    @OneToMany(
            mappedBy = "employees",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Salaries> salaries = new ArrayList<>();

    @OneToMany(
            mappedBy = "employees",
            orphanRemoval = true,
            cascade = CascadeType.ALL
    )
    private List<DeptEmp> departmentEmployees = new ArrayList<>();
    public Employees() {

    }
}
