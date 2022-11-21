package com.adecco.drinkDB.databasePerAlcollizzati.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.adecco.drinkDB.databasePerAlcollizzati.model.Drink;
import com.adecco.drinkDB.databasePerAlcollizzati.service.DrinkService;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	
	@Autowired
	DrinkService drinkService;
	
	
	@GetMapping("/api/getall")
	public List<Drink> getall() {
		
		drinkService.saveDB(drinkService.getLista());
		
		
		return drinkService.getAll();
	}
	
	
	
}
