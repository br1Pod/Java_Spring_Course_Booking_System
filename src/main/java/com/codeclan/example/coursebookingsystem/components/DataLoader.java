package com.codeclan.example.coursebookingsystem.components;

import com.codeclan.example.coursebookingsystem.models.Booking;
import com.codeclan.example.coursebookingsystem.models.Course;
import com.codeclan.example.coursebookingsystem.models.Customer;
import com.codeclan.example.coursebookingsystem.repositories.BookingRepository;
import com.codeclan.example.coursebookingsystem.repositories.CourseRepository;
import com.codeclan.example.coursebookingsystem.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args) {
        Course course1 = new Course("Python 101", "Edinburgh", 4);
        courseRepository.save(course1);

        Course course2 = new Course("Javascript 101", "Glasgow", 5);
        courseRepository.save(course2);

        Course course3 = new Course("Java 101", "Edinburgh", 3);
        courseRepository.save(course3);

        Course course4 = new Course("Ruby 101", "Glasgow", 4);
        courseRepository.save(course4);

        Course course5 = new Course("Go 101", "Edinburgh", 5);
        courseRepository.save(course5);


        Customer customer1 = new Customer("John Lennon", "Glasgow", 28);
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Paul McCartney", "Edinburgh", 29);
        customerRepository.save(customer2);

        Customer customer3 = new Customer("George Harrison", "Perth", 32);
        customerRepository.save(customer3);

        Customer customer4 = new Customer("Ringo Starr", "Dundee", 33);
        customerRepository.save(customer4);

        Customer customer5 = new Customer("Brian Epstein", "Edinburgh", 46);
        customerRepository.save(customer5);


        Booking booking1 = new Booking("07-01-22", course1, customer1);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("14-02-22", course2, customer2);
        bookingRepository.save(booking2);

        Booking booking3 = new Booking("01-02-22", course3, customer3);
        bookingRepository.save(booking3);

        Booking booking4 = new Booking("21-03-22", course4, customer4);
        bookingRepository.save(booking4);

        Booking booking5 = new Booking("08-05-22", course5, customer5);
        bookingRepository.save(booking5);

    }


}
