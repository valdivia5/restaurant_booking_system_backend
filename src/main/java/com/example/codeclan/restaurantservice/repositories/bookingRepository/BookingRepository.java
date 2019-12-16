package com.example.codeclan.restaurantservice.repositories.bookingRepository;

import com.example.codeclan.restaurantservice.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
        List<Booking> findAllBookingsByDate(LocalDateTime date);
    }


