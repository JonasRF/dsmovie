package com.dvsuperior.devsuperior.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dvsuperior.devsuperior.entities.Score;
import com.dvsuperior.devsuperior.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
