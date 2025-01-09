package com.devcoelho.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devcoelho.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
