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


public class Drink {
	
	private String idDrink;
	private String strDrink;
	private String strInstructionsIT;
	private String strDrinkThumb;
	

}
