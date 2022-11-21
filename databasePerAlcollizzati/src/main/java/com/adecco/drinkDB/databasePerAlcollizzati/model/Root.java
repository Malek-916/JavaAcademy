package com.adecco.drinkDB.databasePerAlcollizzati.model;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Root{
    private ArrayList<Drink> drinks;
}