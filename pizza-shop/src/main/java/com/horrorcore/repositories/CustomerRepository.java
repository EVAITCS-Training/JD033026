package com.horrorcore.repositories;

import com.horrorcore.entities.Customer;

import java.util.List;

public class CustomerRepository {
    private final PuesdoDatabase database;

    public CustomerRepository(PuesdoDatabase database) {
        this.database = database;
    }

    public void save(Customer customer) {
        database.getCustomers().add(customer);
    }

    public List<Customer> getAllCustomers() {
        return database.getCustomers();
    }
}
