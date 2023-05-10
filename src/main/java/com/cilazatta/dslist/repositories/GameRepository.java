package com.cilazatta.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cilazatta.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
