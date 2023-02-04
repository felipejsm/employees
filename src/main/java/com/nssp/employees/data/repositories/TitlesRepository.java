package com.nssp.employees.data.repositories;

import com.nssp.employees.data.models.Titles;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface TitlesRepository extends PagingAndSortingRepository<Titles, Long> {
    List<Titles> findBy(Pageable pageable);
}
