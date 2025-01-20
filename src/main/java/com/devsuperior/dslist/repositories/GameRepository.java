package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.Games;

public interface GameRepository extends JpaRepository<Games, Long>{

}
