package com.codeclan.example.coursebookingsystem.repositories;

import com.codeclan.example.coursebookingsystem.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {

    // GET all Courses with a specific Rating
    // Want - Courses
    // Have - rating
    List<Course> findByRating(Integer rating);

}
