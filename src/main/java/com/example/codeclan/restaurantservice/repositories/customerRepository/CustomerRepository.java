package com.example.codeclan.restaurantservice.repositories.customerRepository;

import com.example.codeclan.restaurantservice.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomisedCustomerRepository {
}
