package com.nssp.employees.data;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

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
    public Employees() {

    }
}
