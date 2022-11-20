package com.deboprio.assignmentone.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.deboprio.assignmentone.dao.AddNumbersDAOImpl;
import com.deboprio.assignmentone.services.AddNumbersServiceImpl;


@RestController
public class AddNumbersController {
	
	@Autowired
	private AddNumbersServiceImpl ans;

	
	@GetMapping("/sum/{num}")
	public String getSum(@PathVariable int num) {
		
		if (((AddNumbersDAOImpl) ans.getDao()).getAl().size() == 0)
		{
			System.out.println("list is empty - creating new list");
			ans.setDao(new AddNumbersDAOImpl(new ArrayList<>(List.of(num))));
			return ("First Run -> list size " + ((AddNumbersDAOImpl) ans.getDao()).getAl().size()
					+ " Current Sum " + ((AddNumbersDAOImpl) ans.getDao()).sumList());				
		}
		else 
		{
			((AddNumbersDAOImpl) ans.getDao()).addElements(num);
			return ("Consecutive Run list size " + ((AddNumbersDAOImpl) ans.getDao()).getAl().size()
					+ " Current Sum " + ((AddNumbersDAOImpl) ans.getDao()).sumList());
			
		}
			
		
	}
	@DeleteMapping("/sum")
	public String emptyList()
	{
		((AddNumbersDAOImpl) ans.getDao()).emptyList();
		return "List Cleared! Current list Size " + ((AddNumbersDAOImpl) ans.getDao()).getAl().size();
	}

}
