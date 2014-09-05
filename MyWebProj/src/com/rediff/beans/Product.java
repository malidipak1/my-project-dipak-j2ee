package com.rediff.beans;

public class Product {

	int productId = 0;
	int catId = 0;
	String title = "Prodc title";
	String link = "link";
	String desc = "desc";
	String imgUrl = "img ";
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(int productId) {
		// TODO Auto-generated constructor stub
		this.productId = productId;
	}
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getCatId() {
		return catId;
	}
	public void setCatId(int catId) {
		this.catId = catId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	
}
