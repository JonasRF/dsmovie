package com.dvsuperior.devsuperior.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.dvsuperior.devsuperior.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

	Page<Movie> findAll(Pageable pageable);

}
