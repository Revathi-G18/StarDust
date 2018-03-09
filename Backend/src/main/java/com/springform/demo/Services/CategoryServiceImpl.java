package com.springform.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springform.demo.Dao.CategoryDAO;
import com.springform.demo.Model.Category;
@Transactional
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryDAO categoryDAO;
	public boolean addCategory(Category category) {
		return categoryDAO.addCategory(category);
	}

	public Category getCategory(int categoryId) {
		return categoryDAO.getCategory(categoryId);
	}

	public boolean deleteCategory(Category category) {
		return categoryDAO.deleteCategory(category);
	}

	public boolean updateCategory(Category category) {
		return categoryDAO.updateCategory(category);
	}

	public List<Category> getCategories() {
		return categoryDAO.getCategories();
	}
}
