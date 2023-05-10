package com.cilazatta.dslist.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cilazatta.dslist.dto.GameListDTO;
import com.cilazatta.dslist.repositories.GameListRepository;

@Service
public class GameListService {

	@Autowired
	private GameListRepository listRepo;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List<GameListDTO> dto  = listRepo.findAll().stream()
				.map(w-> new GameListDTO(w))
				.collect(Collectors.toList());
		return dto;
	}
	
}
