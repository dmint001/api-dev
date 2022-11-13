package com.deboprio.learnspringboot.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deboprio.learnspringboot.courses.bean.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{

}
