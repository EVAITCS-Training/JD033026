package com.horrorcore.repositories;

import com.horrorcore.entities.Pizza;

import java.util.List;

public class PizzaRepository {
    private final PuesdoDatabase database;

    public PizzaRepository(PuesdoDatabase database) {
        this.database = database;
    }

    public List<Pizza> getAllPizzas() {
        return database.getPizzas();
    }
}
