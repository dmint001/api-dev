package com.deboprio.assignmentone.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

@Repository
public class AddNumbersDAOImpl implements AddNumbersDAO {
	
	private ArrayList<Integer> al = new ArrayList<>();
	
	public ArrayList<Integer> getAl() {
		return al;
	}

	public AddNumbersDAOImpl(){
		
	}

	public AddNumbersDAOImpl(ArrayList<Integer> aL) {
		super();
		this.al = aL;
	}
	
	public void addElements(Integer i) {
		al.add(i);
		
	}
	
	public int sumList() {
		int result;
		result = al
				  .stream()
				  .reduce(0, (subtotal, element) -> subtotal + element);
		return result;
	}
	
	public void emptyList() {
		al.clear();
	}
	

}
