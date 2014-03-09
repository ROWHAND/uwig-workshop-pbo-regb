package org.uwiga.dao;


import java.util.ArrayList;
import java.util.List;

import org.uwiga.model.Customer;

public class App {

	public App(){
		//Bikin object dao
		CustomerDao customerDao = new CustomerDaoImpl();
		//memasukkan data
		Customer cust1 = new Customer();
		cust1.setIdCustomer("001");
		cust1.setName("Aliyah Ramadhani");
		customerDao.saveOrUpdate(cust1);
		
		Customer cust2 = new Customer();
		cust2.setIdCustomer("002");
		cust2.setName("Ahmad Rohandi");
		customerDao.saveOrUpdate(cust2);
		
		//menampilkan data
	List<Customer> customers = new ArrayList<>();
	customers = customerDao.findAll();
	for (Customer item : customers){
		System.out.println(item);
	}
	for (int i=0; i<customers.size();i++){
		Customer item = new Customer();
		item = customers.get(i);
		System.out.println(item);
	}
	}
	public static void main(String[] args) {
		App f = new App();
	}
}
