package com.example.codeclan.restaurantservice.repositories.tableRepository;

import com.example.codeclan.restaurantservice.models.Customer;

import java.util.List;

public interface CustomisedTableRepository{
    List<Customer> findAllCustomersByTable (Long id);

}
