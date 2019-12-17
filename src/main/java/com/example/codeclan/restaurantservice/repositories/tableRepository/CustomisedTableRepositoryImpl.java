package com.example.codeclan.restaurantservice.repositories.tableRepository;

import com.example.codeclan.restaurantservice.models.Customer;
import com.example.codeclan.restaurantservice.repositories.customerRepository.CustomisedCustomerRepository;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class CustomisedTableRepositoryImpl implements CustomisedTableRepository {

    @Autowired
    EntityManager entityManager;

    @Override
    @Transactional
    public List<Customer> findAllCustomersByRestaurantTable(Long id) {
        List<Customer> result = null;

        try{
        Session session = entityManager.unwrap(Session.class);
        Criteria criteria = session.createCriteria(Customer.class);
        criteria.createAlias("bookings", "booking");
        criteria.add(Restrictions.eq("booking.restaurantTable.id", id));
        result = criteria.list();

        }
        catch (HibernateException ex){
            ex.printStackTrace();
        }
        return result;
    }
}
