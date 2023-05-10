package com.cilazatta.dslist.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cilazatta.dslist.dto.GameMinDTO;
import com.cilazatta.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepo;
	
	public List<GameMinDTO> findAll(){
		
		List<GameMinDTO> dto  = gameRepo.findAll().stream()
				.map(w-> new GameMinDTO(w))
				.collect(Collectors.toList());
		return dto;
	}
	
	
}
