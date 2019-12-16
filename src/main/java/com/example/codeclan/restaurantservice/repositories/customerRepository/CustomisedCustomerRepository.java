package com.example.codeclan.restaurantservice.repositories.customerRepository;

import com.example.codeclan.restaurantservice.models.RestaurantTable;

import java.util.List;

public interface CustomisedCustomerRepository {
    List<RestaurantTable> findAllTablesByCustomer (Long id);
}
