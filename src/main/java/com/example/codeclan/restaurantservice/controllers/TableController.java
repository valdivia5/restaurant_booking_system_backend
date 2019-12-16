package com.example.codeclan.restaurantservice.controllers;

import com.example.codeclan.restaurantservice.repositories.tableRepository.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( value = "/tables")
public class TableController {

    @Autowired
    TableRepository tableRepository;

}
