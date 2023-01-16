package com.nssp.employees.data.models;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.NaturalId;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Data
@IdClass(TitlesId.class)
public class Titles implements Serializable {

    @Id
    @Column(name = "emp_no")
    private Long empNo;

    @Id
    private String title;

    @Id
    @Column(name = "from_date")
    private LocalDate fromDate;

    @Column(name = "to_date")
    private LocalDate toDate;
}
