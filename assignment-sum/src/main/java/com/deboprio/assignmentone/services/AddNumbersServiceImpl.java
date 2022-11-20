package com.deboprio.assignmentone.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deboprio.assignmentone.dao.AddNumbersDAO;

@Service
public class AddNumbersServiceImpl implements AddNumbersService {
	
	@Autowired
	private AddNumbersDAO dao;

	public AddNumbersDAO getDao() {
		return dao;
	}

	public void setDao(AddNumbersDAO dao) {
		this.dao = dao;
	}
	
	

}
