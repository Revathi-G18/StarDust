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
    private CategoryDAO categoryDao;
	public boolean addCategory(Category category) {
		return categoryDao.addCategory(category);
	}

	public Category getCategory(int categoryId) {
		return categoryDao.getCategory(categoryId);
	}

	public boolean deleteCategory(Category category) {
		return categoryDao.deleteCategory(category);
	}

	public boolean updateCategory(Category category) {
		return categoryDao.updateCategory(category);
	}

	public List<Category> getCategories() {
		return categoryDao.getCategories();
	}
}
