package com.cilazatta.dslist.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cilazatta.dslist.dto.GameListDTO;
import com.cilazatta.dslist.dto.GameMinDTO;
import com.cilazatta.dslist.services.GameListService;
import com.cilazatta.dslist.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

	@Autowired
	private GameListService gameListServ;
	
	@Autowired
	private GameService gameServ;
	
	@GetMapping
	public List<GameListDTO> findAll(){
		List<GameListDTO> dto = this.gameListServ.findAll();
		return dto;
	}
	
	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findByList(@PathVariable Long listId){
		List<GameMinDTO> dto = this.gameServ.findByList(listId);
		return dto;
	}
	
}
