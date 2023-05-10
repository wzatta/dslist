package com.cilazatta.dslist.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cilazatta.dslist.dto.GameDTO;
import com.cilazatta.dslist.dto.GameMinDTO;
import com.cilazatta.dslist.entities.GameMinProjection;
import com.cilazatta.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepo;
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		List<GameMinDTO> dto  = gameRepo.findAll().stream()
				.map(w-> new GameMinDTO(w))
				.collect(Collectors.toList());
		return dto;
	}
	
	@Transactional(readOnly = true)
	public GameDTO findById(long id) {
		GameDTO result = gameRepo.findById(id).map(w-> new GameDTO(w)).get();
		return result;
		}

	@Transactional(readOnly = true)
	public List<GameMinDTO> findByList(Long listId){
		List<GameMinDTO> dto  = gameRepo.searchByList(listId).stream()
				.map(w-> new GameMinDTO(w)).toList();
		return dto;
	}
	
	
}
