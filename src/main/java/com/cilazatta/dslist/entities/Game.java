package com.cilazatta.dslist.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tb_game")
public class Game {
	
	@Id
	@EqualsAndHashCode.Include
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String title;
	@Column(name = "game_year")
	private Integer year;
	private String genre;
	private String platforms;
	private Double score;
	private String imgUrl;
	@Column(columnDefinition = "TEXT")
	private String shortDescription;
	@Column(columnDefinition = "TEXT")
	private String longDescription;
	

}
