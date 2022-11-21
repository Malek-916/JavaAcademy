package com.adecco.drinkDB.databasePerAlcollizzati.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity
@Table(name="bevande")
public class Drink {
	
	
	@Id
	private String idDrink;
	
	@Column(name="nome")
	private String strDrink;
	
	@Column(name="istruzioni")
	private String strInstructionsIT;
	
	@Column(name="url-immagine")
	private String strDrinkThumb;
	
}
