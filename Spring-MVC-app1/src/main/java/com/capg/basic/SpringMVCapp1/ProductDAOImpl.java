package com.capg.basic.SpringMVCapp1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component
public class ProductDAOImpl {
	
	List<Product> list = new LinkedList<>();

	public ProductDAOImpl() {
		
		Product p1 = new Product(101, "HP-101",45000,4);
		Product p2 = new Product(102, "HP-102",15000,5);
		Product p3 = new Product(103, "HP-103",25000,3);
		Product p4 = new Product(104, "HP-104",20000,5);
		Product p5 = new Product(105, "HP-105",145000,2);
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
	
	}
	
	public List<Product> getAllProducts()
	{
		return list;
	}
	
	public boolean insertProduct(Product product)
	{
		return list.add(product);
	}
	
	public List<Product> getProductsByRange(int r1,int r2)
	{
		
	//	Comparator<Product> comp = (p1,p2)->p1.getProductCost() - p2.getProductCost();
		
		List<Product> productList = list.stream().
		filter((product)->product.getProductCost()>=r1&&product.getProductCost()<=r2).
		collect(Collectors.toList());
		
	
		return productList;
	}
	
	public Product getProductById(int searchid)
	{
		boolean isIdFound = false;
		Product searchedProduct = null;
		for (Product product : list) {
			if(product.getProductId() == searchid)
			{
				isIdFound = true;
				searchedProduct = product;
				break;
			}
		}
		return searchedProduct;
	}
	
	public List<Product> sortProductByRating()
	{
		Comparator<Product> ratingSort=(p1,p2)->p1.getProductRating()-p2.getProductRating();
		List<Product> ratingList=list.stream().sorted(ratingSort).collect(Collectors.toList());
		return ratingList;
		
	}
	
	public List<Product> getProductByRating(int rating)
	{
		List<Product> productList = list.stream().
				filter((product)->product.getProductRating()==rating).
				collect(Collectors.toList());
		
		return productList;
	}
	
	public boolean deleteProductById(int searchId)
	{
		boolean isDeleted=false;
		for (Product product : list) {
			
			if(product.getProductId()==searchId)
			{
				isDeleted=list.remove(product);
			}
		}
		
		return isDeleted;
		
	}
	
	
	public Product doUpdateProduct(Product updatedProduct,int productId)
	{
		Product p = getProductById(productId);
		if(p!=null)
		{
			p.setProductCost(updatedProduct.getProductCost());
			p.setProductName(updatedProduct.getProductName());
			p.setProductId(updatedProduct.getProductId());
			p.setProductRating(updatedProduct.getProductRating());
		}
		return p;
		
		
		
	}
	

}
