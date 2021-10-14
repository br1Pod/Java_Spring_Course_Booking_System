package com.codeclan.example.coursebookingsystem.repositories;

import com.codeclan.example.coursebookingsystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {


    // GET all Customers for a given course
    // Want - Customer
    // Have - course id
    List<Customer> findByBookingsCourseName(String course);


}
