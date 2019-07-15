package com.capgemini.takehome.dao;

import java.util.HashMap;
import java.util.Map;

import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.util.CollectionUtil;

public class ProductDAO {
	Map<Integer,Product> map = new HashMap<Integer,Product>();
	CollectionUtil collectionUtil = new CollectionUtil();
	Product products =  new Product();
	
	public Product getProductDetails(int productCode) {
		
		map =(Map<Integer, Product>) CollectionUtil.getProducts();
		if(map.containsKey(productCode)) {
			 products=map.get(productCode);
		}else {
		}
		return products;
		
	}

}
