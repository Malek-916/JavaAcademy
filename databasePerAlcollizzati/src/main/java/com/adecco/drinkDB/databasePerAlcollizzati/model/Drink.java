package com.adecco.drinkDB.databasePerAlcollizzati.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
	@Column
	private String idDrink;
	
	@Column
	private String strDrink;
	
	@Column
	private String strInstructionsIT;
	
	@Column
	private String strDrinkThumb;
	
}
