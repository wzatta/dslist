package com.cilazatta.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cilazatta.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
