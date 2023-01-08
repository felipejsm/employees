package com.nssp.employees;

import com.nssp.employees.data.models.Employees;
import com.nssp.employees.data.models.Titles;
import com.nssp.employees.data.repositories.EmployeesRepository;
import com.nssp.employees.data.repositories.TitlesRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class EmployeesApplication {

	private EmployeesRepository repository;
	private TitlesRepository titlesRepository;

	public EmployeesApplication(final EmployeesRepository repository,
								final TitlesRepository titlesRepository) {
		this.repository = repository;
		this.titlesRepository = titlesRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(EmployeesApplication.class, args);
	}

	@GetMapping
	public List<Titles> get() {
		return this.titlesRepository.findBy(PageRequest.of(1, 10));
	}

}
