package com.cilazatta.dslist.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cilazatta.dslist.dto.GameDTO;
import com.cilazatta.dslist.dto.GameMinDTO;
import com.cilazatta.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {

	@Autowired
	private GameService gameServ;
	
	@GetMapping
	public List<GameMinDTO> findAll(){
		List<GameMinDTO> dto = this.gameServ.findAll();
		return dto;
	}
	
	@GetMapping(value = "/{id}")
	public GameDTO findById(@PathVariable Long id) {
		GameDTO dto = gameServ.findById(id);
		return dto;
	}
	
	
}
