package com.cilazatta.dslist.dto;

import com.cilazatta.dslist.entities.GameList;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class GameListDTO {
	
	private Long id;
	private String name;
	
	public GameListDTO(GameList entity) {
		this.id = entity.getId();
		this.name = entity.getName();
	}

}
