package com.example.codeclan.restaurantservice.components;

import com.example.codeclan.restaurantservice.models.Booking;
import com.example.codeclan.restaurantservice.models.Customer;
import com.example.codeclan.restaurantservice.models.RestaurantTable;
import com.example.codeclan.restaurantservice.repositories.bookingRepository.BookingRepository;
import com.example.codeclan.restaurantservice.repositories.customerRepository.CustomerRepository;
import com.example.codeclan.restaurantservice.repositories.tableRepository.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    TableRepository tableRepository;

    public DataLoader (){}

    public void run(ApplicationArguments args){

        LocalDateTime time1 = LocalDateTime.parse("2019-12-18T19:30:00");
        LocalDateTime time2 = LocalDateTime.parse("2019-12-19T21:00:00");
        LocalDateTime time3 = LocalDateTime.parse("2019-12-20T20:00:00");


        RestaurantTable table1 = new RestaurantTable(1, 3);
        tableRepository.save(table1);

        Customer customer1= new Customer("Harry","whateva@hotmail.com", 1);
        customerRepository.save(customer1);

        Booking booking1 = new Booking(1,time1, customer1, table1);
        bookingRepository.save(booking1);
//----------------------------------------------------------------------------------------------
        RestaurantTable table2 = new RestaurantTable(2, 3);
        tableRepository.save(table2);

        Customer customer2= new Customer("Haharry","whatevahaha@hotmail.com", 1);
        customerRepository.save(customer2);

        Booking booking2 = new Booking(1,time2, customer2, table2);
        bookingRepository.save(booking2);
//----------------------------------------------------------------------------------------------
        RestaurantTable table3 = new RestaurantTable(3, 3);
        tableRepository.save(table3);

        Customer customer3= new Customer("Bobby","whatevabobbyhaha@hotmail.com", 1);
        customerRepository.save(customer3);

        Booking booking3 = new Booking(1,time3, customer3, table3);
        bookingRepository.save(booking3);
//----------------------------------------------------------------------------------------------

    }

}
