package com.adecco.drinkDB.databasePerAlcollizzati.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adecco.drinkDB.databasePerAlcollizzati.model.Drink;


@Repository
public interface DrinkRepository extends JpaRepository<Drink, String> {
	
}
