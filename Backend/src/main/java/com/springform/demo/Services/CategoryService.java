package com.springform.demo.Services;

import java.util.List;

import com.springform.demo.Model.Category;

public interface CategoryService {
	public boolean addCategory(Category category);
	 public Category getCategory(int categoryId);
	 public boolean deleteCategory(Category category);
		public boolean updateCategory(Category category);
		public List<Category> getCategories();
}
