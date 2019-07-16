package com.capgemini.takehome.service;

import java.util.HashMap;


import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.dao.ProductDAO;

public class ProductService {
	Product product;
	ProductDAO productDAO = new ProductDAO();

	HashMap<Integer, Product> map= new HashMap<Integer, Product>();
	
	public Product getProductDetails (int productCode) throws ProductNotFoundException {
		product= productDAO.getProductDetails(productCode);
		if(product==null) {
			throw new ProductNotFoundException();
		}
		return product;
		
	}

}
