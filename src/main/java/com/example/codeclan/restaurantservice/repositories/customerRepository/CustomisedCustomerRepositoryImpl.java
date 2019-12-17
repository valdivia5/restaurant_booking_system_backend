package com.example.codeclan.restaurantservice.repositories.customerRepository;

import com.example.codeclan.restaurantservice.models.RestaurantTable;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;

import javax.transaction.Transactional;
import java.util.List;

public class CustomisedCustomerRepositoryImpl implements CustomisedCustomerRepository {

    @Autowired
    EntityManager entityManager;

    @Override
    @Transactional
    public List<RestaurantTable> findAllTablesByCustomer(Long id){
        List<RestaurantTable> result = null;

        Session session = entityManager.unwrap(Session.class);
        Criteria criteria = session.createCriteria(RestaurantTable.class);
        criteria.createAlias("bookings", "booking");
        criteria.add(Restrictions.eq("booking.customer.id", id));
        result = criteria.list();
        return result;

    }
}
