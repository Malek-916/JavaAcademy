package com.adecco.drinkDB.databasePerAlcollizzati.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.adecco.drinkDB.databasePerAlcollizzati.model.Drink;
import com.adecco.drinkDB.databasePerAlcollizzati.model.Root;
import com.adecco.drinkDB.databasePerAlcollizzati.repository.DrinkRepository;

@Service
public class DrinkService {
	
	@Autowired
	DrinkRepository drinkRepository;

	public void dataDrinkFetch() {
		RestTemplate restTemplate = new RestTemplate();
		
		Root rootDrink = restTemplate.getForObject("https://www.thecocktaildb.com/api/json/v1/1/search.php?s=margarita"
				, Root.class);
		
		for (Drink d: rootDrink.getDrinks()) {
			System.out.println(d);
			
		}
		
		
	}
	
	public boolean saveDB(ArrayList<Drink> lista) {
		
		if (lista==null)
			return false;
		
		for (Drink d : lista) {
			if (drinkRepository.findById(d.getIdDrink()) == null)
				drinkRepository.save(d);
		}
		return true;
		
		
	}
	
	public ArrayList<Drink> getLista() {
RestTemplate restTemplate = new RestTemplate();
		
		Root rootDrink = restTemplate.getForObject("https://www.thecocktaildb.com/api/json/v1/1/search.php?s=margarita"
				, Root.class);
		return rootDrink.getDrinks();
	}
	
	public List<Drink> getAll() {
		return drinkRepository.findAll();
	}
	

	
	
	
	
}
