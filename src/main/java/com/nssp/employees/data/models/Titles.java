package com.nssp.employees.data.models;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.NaturalId;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Data
public class Titles implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    @MapsId
    @ManyToOne
    @JoinColumn(
            name = "emp_no",
            columnDefinition = "emp_no",
            insertable = false,
            updatable = false)
    private Employees employees;

    @Column(name = "to_date")
    private LocalDate toDate;

    @Column(name = "from_date")
    private LocalDate fromDate;

}
