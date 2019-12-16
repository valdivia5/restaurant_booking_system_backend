package com.example.codeclan.restaurantservice.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "bookings")

public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numberOfPeople")
    private int numberOfPeople;

    @Column(name = "date")
    private LocalDateTime date;

    @JsonIgnoreProperties("booking")
    @ManyToOne

    @JoinColumn(name = "customer_id",nullable = false)
    private Customer customer;

    @JsonIgnoreProperties("booking")
    @ManyToOne

    @JoinColumn(name = "restaurantTable_id", nullable = false)
    private RestaurantTable restaurantTable;

    public Booking(int numberOfPeople, LocalDateTime date, Customer customer, RestaurantTable restaurantTable) {
        this.numberOfPeople = numberOfPeople;
        this.date = date;
        this.customer = customer;
        this.restaurantTable = restaurantTable;
    }

    public Booking() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public RestaurantTable getRestaurantTable() {
        return restaurantTable;
    }

    public void setRestaurantTable(RestaurantTable restaurantTable) {
        this.restaurantTable = restaurantTable;
    }
}
