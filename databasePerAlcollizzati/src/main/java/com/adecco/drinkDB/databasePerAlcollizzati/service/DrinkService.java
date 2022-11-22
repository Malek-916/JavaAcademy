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

		Root rootDrink = restTemplate.getForObject("https://www.thecocktaildb.com/api/json/v1/1/search.php?s=margarita",
				Root.class);

		for (Drink d : rootDrink.getDrinks()) {
			System.out.println(d);

		}

	}

	public boolean saveDbDrink(Drink drink) {

		drinkRepository.save(drink);
		return true;

	}

	public ArrayList<Drink> getListaByNome(String nome) {
		RestTemplate restTemplate = new RestTemplate();

		Root rootDrink = restTemplate.getForObject("https://www.thecocktaildb.com/api/json/v1/1/search.php?s=" + nome,
				Root.class);
		return rootDrink.getDrinks();
	}

	public ArrayList<Drink> getLista() {
		RestTemplate restTemplate = new RestTemplate();

		Root rootDrink = restTemplate.getForObject("https://www.thecocktaildb.com/api/json/v1/1/search.php?s=margarita",
				Root.class);
		return rootDrink.getDrinks();
	}

	public List<Drink> getAll() {
		return drinkRepository.findAll();
	}

	public boolean addByName(String name) {
		for (Drink d : getListaByNome(name)) {
			if (d != null && drinkRepository.findById(d.getIdDrink()) == null)
				drinkRepository.save(d);
		}
		return true;
	}

	public List<Drink> getListByLetter(char lettera) {
		RestTemplate restTemplate = new RestTemplate();

		Root rootDrink = restTemplate
				.getForObject("https://www.thecocktaildb.com/api/json/v1/1/search.php?s=" + lettera, Root.class);

		for (Drink d : rootDrink.getDrinks()) {
			if (d.getStrInstructionsIT() != null) {

				if (d.getStrInstructionsIT().length() > 255) {
					d.setStrInstructionsIT(d.getStrInstructionsIT().substring(0, 254));
				}

			}
		}
		return rootDrink.getDrinks();
	}

	public boolean addAll() {

		char[] lettere = "abcdefghijklmnopqrstuvwxyz".toCharArray();

		for (int i = 0; i < lettere.length; i++) {
			for (Drink d : getListByLetter(lettere[i])) {
				if (drinkRepository.findById(d.getIdDrink()) != null)
					drinkRepository.save(d);
			}
		}
		return true;
	}

	
	public boolean deleteAll() {
		drinkRepository.deleteAll();
		return true;
	}
}
