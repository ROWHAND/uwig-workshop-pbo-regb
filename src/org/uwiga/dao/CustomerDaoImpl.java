package org.uwiga.dao;

import java.util.*;

import org.uwiga.model.Customer;

public class CustomerDaoImpl implements CustomerDao {
List<Customer> listCustomer = new ArrayList<>();
	@Override
	public void saveOrUpdate(Customer o) {
		listCustomer.add(o);
	}

	@Override
	public void delete(Customer o) {
		listCustomer.remove(o);
	}

	@Override
	public List<Customer> findAll() {
		return listCustomer;
	}

	@Override
	public List<Customer> findById() {
		return listCustomer;
	}
}
