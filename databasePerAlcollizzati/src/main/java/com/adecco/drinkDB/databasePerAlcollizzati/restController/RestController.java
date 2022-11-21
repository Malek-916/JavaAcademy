package com.adecco.drinkDB.databasePerAlcollizzati.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.adecco.drinkDB.databasePerAlcollizzati.model.Drink;
import com.adecco.drinkDB.databasePerAlcollizzati.service.DrinkService;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	
	@Autowired
	DrinkService drinkService;
	
	
	@PostMapping("/api/add")
	public boolean getall(@RequestBody Drink drink) {
		

		return drinkService.saveDbDrink(drink);
	}
	
	@GetMapping("/api/cerca")
	public List<Drink> cercaPerNome(@RequestParam String nome) {
		
		return drinkService.getListaByNome(nome);
		
	}
	
	
	@GetMapping("/api/getall")
	public List<Drink> getAll() {
		return drinkService.getAll();
		
	}
	
	@GetMapping("/api/addByName")
	public boolean addByName(@RequestParam String nome) {
		drinkService.addByName(nome);
		return true;
	}
}
