package com.nssp.employees;

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
import java.util.concurrent.TimeUnit;

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

	@GetMapping("page")
	public Page<Titles> get() {
		long startTime = System.nanoTime();
		var response = this.titlesRepository.findAll(PageRequest.of(1, 100));
		long endTime = System.nanoTime();
		long duration = TimeUnit.MILLISECONDS.convert( (endTime - startTime), TimeUnit.NANOSECONDS);
		System.out.println("Page time: "+duration);
		return response;
	}

	@GetMapping("list")
	public List<Titles> getList() {
		long startTime = System.nanoTime();
		var response = this.titlesRepository.findBy(PageRequest.of(1, 10000));
		long endTime = System.nanoTime();
		long duration = TimeUnit.MILLISECONDS.convert( (endTime - startTime), TimeUnit.NANOSECONDS);
		System.out.println("List time: "+duration);
		return response;
	}
}
