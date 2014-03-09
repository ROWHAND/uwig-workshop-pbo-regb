package org.uwiga.dao;

import java.util.*;

import org.uwiga.model.Product;

public interface ProductDao {

	void saveOrUpdate(Product o);

	void delete(Product o);

	List<Product> findAll();

	List<Product> findById();
}
