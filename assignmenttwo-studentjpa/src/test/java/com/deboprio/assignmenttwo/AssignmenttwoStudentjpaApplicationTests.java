package com.deboprio.assignmenttwo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.deboprio.assignmenttwo.entities.Student;
import com.deboprio.assignmenttwo.repos.StudentRepository;

@SpringBootTest
class AssignmenttwoStudentjpaApplicationTests {
	
	@Autowired
	private StudentRepository repo;

	@Test
	void testDbMethods() {
		Student s1 = new Student();
		s1.setId(1);
		s1.setMarks(85);
		s1.setName("Deb");
		repo.save(s1);	
		
		
	}

}
