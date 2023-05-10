package com.cilazatta.dslist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class BelongingPK {
	
	@EqualsAndHashCode.Include
	@ManyToOne
	@JoinColumn(name= "game_id")
	private Game game;
	
	@EqualsAndHashCode.Include
	@ManyToOne
	@JoinColumn(name= "gameList_id")
	private GameList gameList;

}
