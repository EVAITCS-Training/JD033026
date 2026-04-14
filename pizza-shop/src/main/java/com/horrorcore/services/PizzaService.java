package com.horrorcore.services;

import com.horrorcore.repositories.PizzaRepository;

public class PizzaService {
    private final PizzaRepository pizzaRepository;

    public PizzaService(PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }

    public void displayPizzas() {
        System.out.println("Horrorcore Pizza Shop");
        pizzaRepository.getAllPizzas().forEach(System.out::println);
    }
}
