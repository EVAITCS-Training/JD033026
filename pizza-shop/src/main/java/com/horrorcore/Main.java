package com.horrorcore;

import com.horrorcore.repositories.OrderRepository;
import com.horrorcore.repositories.PizzaRepository;
import com.horrorcore.repositories.PuesdoDatabase;
import com.horrorcore.services.PizzaService;

public class Main {
    static void main() {
        final PuesdoDatabase database = new PuesdoDatabase();
        final PizzaRepository pizzaRepository = new PizzaRepository(database);
        final OrderRepository orderRepository = new OrderRepository(database);
        final PizzaService pizzaService = new PizzaService(pizzaRepository);

        pizzaService.displayPizzas();
    }
}
