package org.uwiga.dao;

import java.util.*;

import org.uwiga.model.Customer;

public interface CustomerDao {

	public void saveOrUpdate(Customer o);

	public void delete(Customer o);

	public List<Customer> findAll();

	public List<Customer> findById();
}
