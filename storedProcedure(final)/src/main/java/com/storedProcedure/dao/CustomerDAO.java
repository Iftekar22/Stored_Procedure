package com.storedProcedure.dao;

import java.util.List;

import com.storedProcedure.model.Account;
import com.storedProcedure.model.Customer;

public interface CustomerDAO {
	
	public List<Customer> getCustomer();

}
