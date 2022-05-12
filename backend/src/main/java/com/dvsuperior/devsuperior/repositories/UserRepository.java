package com.dvsuperior.devsuperior.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dvsuperior.devsuperior.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

}
