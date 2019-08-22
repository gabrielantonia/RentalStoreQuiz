package com.skilldistillery.entities;

import java.util.HashSet;
import java.util.Set;

public class Store {
	private int id = 0;
	private Set<Customer> store = new HashSet<Customer>();
	public void addCustomer(Customer c) {
		store.add(c);
	}
	public int customerAmount() {
		return store.size();
    }
	public void displayAllData() {
		System.out.println();
		for (Customer c : store) {
			System.out.println(c.toString());
		}
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
