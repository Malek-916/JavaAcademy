package com.adecco.drinkDB.databasePerAlcollizzati.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.adecco.drinkDB.databasePerAlcollizzati.model.Drink;
import com.adecco.drinkDB.databasePerAlcollizzati.model.Root;

@Service
public class DrinkService {

	public void dataDrinkFetch() {
		RestTemplate restTemplate = new RestTemplate();
		
		Root rootDrink = restTemplate.getForObject("https://www.thecocktaildb.com/api/json/v1/1/search.php?s=margarita"
				, Root.class);
		
		for (Drink d: rootDrink.getDrinks()) {
			System.out.println(d);
			
		}
		
		
	}
	

	
	
	
	
}
