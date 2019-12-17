package com.example.codeclan.restaurantservice.controllers;

import com.example.codeclan.restaurantservice.repositories.bookingRepository.BookingRepository;
import com.example.codeclan.restaurantservice.repositories.customerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

//    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
//    public void deleteCell(@PathVariable long id){
//        cellRepository.deleteById(id);
//    }
}