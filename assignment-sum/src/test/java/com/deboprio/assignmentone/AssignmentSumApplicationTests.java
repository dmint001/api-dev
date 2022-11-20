package com.deboprio.assignmentone;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.deboprio.assignmentone.dao.AddNumbersDAOImpl;
import com.deboprio.assignmentone.services.AddNumbersServiceImpl;

@SpringBootTest
class AssignmentSumApplicationTests {
	
	@Autowired
	private AddNumbersServiceImpl ans;

	@Test
	void testAddition() {
		
		ans.setDao(new AddNumbersDAOImpl(new ArrayList<>(List.of(1,2,3,4,5))));
		System.out.println(((AddNumbersDAOImpl) ans.getDao()).sumList());
	}

}
