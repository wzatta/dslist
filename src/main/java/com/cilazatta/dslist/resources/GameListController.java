package com.cilazatta.dslist.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cilazatta.dslist.dto.GameListDTO;
import com.cilazatta.dslist.services.GameListService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

	@Autowired
	private GameListService gameListServ;
	
	@GetMapping
	public List<GameListDTO> findAll(){
		List<GameListDTO> dto = this.gameListServ.findAll();
		return dto;
	}
	
}
