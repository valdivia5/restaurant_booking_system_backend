package com.example.codeclan.restaurantservice.repositories.tableRepository;
import com.example.codeclan.restaurantservice.models.Customer;
import com.example.codeclan.restaurantservice.models.RestaurantTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TableRepository extends JpaRepository<RestaurantTable, Long>, CustomisedTableRepository {
    List<Customer> findAllCustomersByRestaurantTable (Long id);
}
