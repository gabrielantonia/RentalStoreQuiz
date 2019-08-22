package com.skilldistillery.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.skilldistillery.application.RentalStoreQuizApp;

class RentalStoreTests {
	// TODO: make necessary declarations
	private RentalStoreQuizApp rsqa;

	 @BeforeEach
	  void setUp() {
	    rsqa= new RentalStoreQuizApp();
	  }

	  @AfterEach
	  void tearDown() {
	    rsqa= null;
	  }

	  @Test
	  @DisplayName("Checks for duplicate customers")
	  void testCustomers() {
	 Store store = rsqa.createStore();
	 Customer ct = rsqa.createCustomer("This", "guy");
	 Customer ct1 = rsqa.createCustomer("This", "guy");
	 rsqa.registerCustomerAtStore(store, ct);
	 rsqa.registerCustomerAtStore(store, ct1);
	    assertEquals(1, store.customerAmount());
	  }

}
