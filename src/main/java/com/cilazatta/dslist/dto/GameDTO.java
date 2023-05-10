package com.cilazatta.dslist.dto;

import com.cilazatta.dslist.entities.Game;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GameDTO {
	private Long id;
	private String title;
	private Integer year;
	private String genre;
	private String platforms;
	private Double score;
	private String imgUrl;
	private String shortDescription;
	private String longDescription;
	
	public GameDTO(Game game) {
		
		this.id = game.getId();
		this.title = game.getTitle();
		this.year = game.getYear();
		this.genre = game.getGenre();
		this.platforms = game.getPlatforms();
		this.score = game.getScore();
		this.imgUrl = game.getImgUrl();
		this.shortDescription = game.getShortDescription();
		this.longDescription = game.getLongDescription();
	}

}
