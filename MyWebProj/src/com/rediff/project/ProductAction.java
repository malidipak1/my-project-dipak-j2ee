package com.rediff.project;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.rediff.beans.Product;

public class ProductAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4602702973919851684L;

	int productId = 0;
	List<Product> lst = null;
 	Product objProduct = null;
 	
	public List<Product> getProductList() {
		return lst;
	}

	public void setProductList(List<Product> lst) {
		this.lst = lst;
	}

	public Product getProduct() {
		return objProduct;
	}

	public void setProduct(Product objProduct) {
		this.objProduct = objProduct;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String  execute() {
		return SUCCESS;
	}
	
	public String getList() {
		
		Product prObj = new Product();
		lst.add(prObj);
		return SUCCESS;
	}
	
	public String getDetails() {
		/*if(this.productId == 0) 
			return ERROR;*/
		
		this.objProduct = new Product(getProductId());
		return SUCCESS;
	}
}
