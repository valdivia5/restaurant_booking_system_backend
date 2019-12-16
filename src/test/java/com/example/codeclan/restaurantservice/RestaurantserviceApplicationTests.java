package com.example.codeclan.restaurantservice;

import com.example.codeclan.restaurantservice.models.Booking;
import com.example.codeclan.restaurantservice.models.Customer;
import com.example.codeclan.restaurantservice.models.RestaurantTable;
import com.example.codeclan.restaurantservice.repositories.bookingRepository.BookingRepository;
import com.example.codeclan.restaurantservice.repositories.customerRepository.CustomerRepository;
import com.example.codeclan.restaurantservice.repositories.tableRepository.TableRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest

class RestaurantserviceApplicationTests {


	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	TableRepository tableRepository;


	@Test
	void contextLoads() {
	}

	@Test
	public void canFindAllBookings(){
		List<Booking> found = bookingRepository.findAll();
		assertEquals(3, found.size());
	}

	@Test
	public void canGetAllCustomersForABookedTable(){
		List<Customer> found = tableRepository.findAllCustomersByTable(1L);
		assertEquals(1, found.size());
		assertEquals("Harry",found.get(0).getName());
	}



}
