package com.springform.demo.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
public class Category {
	@Id
	@GeneratedValue
	private int categoryId;	
		private String categoryName;
		private String cateogryDesc;
		@OneToMany(mappedBy="category")
		private List<Product> products;
		
		
		
		public List<Product> getProducts() {
			return products;
		}
		public void setProducts(List<Product> products) {
			this.products = products;
		}
		public int getCategoryId() {
			return categoryId;
		}
		public void setCategoryId(int categoryId) {
			this.categoryId = categoryId;
		}
		public String getCategoryName() {
			return categoryName;
		}
		public void setCategoryName(String categoryName) {
			this.categoryName = categoryName;
		}
		public String getCateogryDesc() {
			return cateogryDesc;
		}
		public void setCateogryDesc(String cateogryDesc) {
			this.cateogryDesc = cateogryDesc;
		}
}
