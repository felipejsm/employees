package com.nssp.employees.data.models;

import jakarta.persistence.Column;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class SalariesId implements Serializable {

    @Column(name = "emp_no")
    private Long empNo;
    @Column(name = "from_date")
    private LocalDate fromDate;

}
