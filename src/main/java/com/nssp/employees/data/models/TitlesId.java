package com.nssp.employees.data.models;

import jakarta.persistence.Column;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class TitlesId implements Serializable {
    @Column(name = "emp_no")
    private Long empNo;

    private String title;

    @Column(name = "to_date")
    private LocalDate toDate;

}
