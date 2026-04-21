package com.horrorcore;

import com.horrorcore.config.DatabaseConfig;
import com.horrorcore.entities.Pizza;
import com.horrorcore.repositories.JdbcPizzaRepository;
import com.horrorcore.repositories.OrderRepository;
import com.horrorcore.repositories.PizzaRepository;
import com.horrorcore.repositories.PuesdoDatabase;
import com.horrorcore.services.PizzaService;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    static void main() {
//        final PuesdoDatabase database = new PuesdoDatabase();
//        final PizzaRepository pizzaRepository = new PizzaRepository(database);
//        final OrderRepository orderRepository = new OrderRepository(database);
//        final PizzaService pizzaService = new PizzaService(pizzaRepository);
//
//        pizzaService.displayPizzas();
        Connection connection = null;
        try {
            connection = DatabaseConfig.getInstance().getConn();
            System.out.println("DATABASE CONNECTION MADE!!!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        JdbcPizzaRepository repository = new JdbcPizzaRepository(connection);
        repository.save(new Pizza("Cheese Pizza", new BigDecimal("9.99"), 'L'));
    }
}
