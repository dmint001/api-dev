package com.deboprio.assignmenttwo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deboprio.assignmenttwo.entities.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
