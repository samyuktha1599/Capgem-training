package com.capg.basic.SpringMVCapp1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyRestController {
	
	@Autowired
	ProductDAOImpl dao;
	
	@GetMapping("/hello")
	public String sayHello()
	{
		return "Hello";
	}
    
	@GetMapping("/product")
	public List<Product> getProducts()
	{
		return dao.getAllProducts();
		
	}
	
	@PostMapping("/product")
	public Product insertProduct(@RequestBody Product product)
	{
		if(dao.insertProduct(product))
		{
			return product;
		}
		return null;
	}
	
	
	
	//            localhost:9090:\product\10000\40000
	//  endpoint :- www.abc.com\product\10000\40000
	@GetMapping("/product/{r1}/{r2}")
	public List<Product> getProductsbyrange(@PathVariable int r1 ,@PathVariable int r2)
	{
		return dao.getProductsByRange(r1, r2);
	}
	
	// ..../product/101
	@GetMapping("/product/{searchid}")
	public Product getProductByid(@PathVariable int searchid)
	{
		return dao.getProductById(searchid);
	}
	
	@GetMapping("/product/rating")
	public List<Product> sortProductByRating()
	{
		
		return dao.sortProductByRating();
		
	}
	
	@GetMapping("/product/rating/{rating}")
	public List<Product> getProductByRating(@PathVariable int rating)
	{
		return  dao.getProductByRating(rating);
	}
	
		

	@DeleteMapping("/product/{searchId}")
	public String deleteProductById(@PathVariable int searchId)
	{
		if(dao.deleteProductById(searchId))
		{
			return "Deleted Product";
		}
		return null;
	}
	
	@PutMapping("/product")
	public Product updateProduct(@RequestBody Product product)
	{
		return dao.doUpdateProduct(product,product.getProductId());
	}

}
