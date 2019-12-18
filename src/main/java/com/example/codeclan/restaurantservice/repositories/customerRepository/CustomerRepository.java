package com.example.codeclan.restaurantservice.repositories.customerRepository;

import com.example.codeclan.restaurantservice.models.Customer;
import com.example.codeclan.restaurantservice.projections.EmbedCustomerAndBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@RepositoryRestResource(excerptProjection = EmbedCustomerAndBooking.class)
public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomisedCustomerRepository {
//    List<Customer> destroyCustomerById (Long id);

}
