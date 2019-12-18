package com.example.codeclan.restaurantservice.projections;

import com.example.codeclan.restaurantservice.models.Booking;
import com.example.codeclan.restaurantservice.models.Customer;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name="embedCustomerAndBooking", types = Customer.class)
public interface EmbedCustomerAndBooking {
    Long getId();
    String getName();
    String getEmail();
    int getNumberOfVisits();
    List<Booking> getBookings();
}
