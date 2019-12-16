package com.example.codeclan.restaurantservice.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "restaurant_tables")
public class RestaurantTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "number")
    private int number;

    @Column(name = "capacity")
    private int capacity;

    @JsonIgnoreProperties("restaurantTable")
    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    @OneToMany(mappedBy = "restaurantTable", fetch = FetchType.LAZY)
    private List<Booking> bookings;

    public RestaurantTable(int number, int capacity) {
        this.number = number;
        this.capacity = capacity;
        this.bookings = new ArrayList<>();
    }

    public RestaurantTable(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public void addBookings(Booking booking){
        this.bookings.add(booking);
    }
}
