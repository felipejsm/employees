package com.nssp.employees.data.repositories;

import com.nssp.employees.data.models.Employees;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EmployeesRepository extends PagingAndSortingRepository<Employees, Long> {

}
