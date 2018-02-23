/*package com.Demo.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Demo.dao.CategoryDAO;
import com.Demo.model.Category;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CategoryUnitTest {


		static CategoryDAO categoryDAO;

		@BeforeClass
		public static void executeFirst()
		{
			AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
			context.scan("com.Demo");
			context.refresh();
			
			categoryDAO=(CategoryDAO)context.getBean("categoryDAO");
		}
		
		@Test
		public void addCategoryTest()
		{
			Category category=new Category();
			category.setCategoryName("Book Cupboard");
			category.setCateogryDesc("All the Book Cupboard Types");
			assertTrue("Problem in Category Insertion",categoryDAO.addCategory(category));
		}
		
		@Ignore
		@Test
		public void getCategoryTest()
		{
			assertNotNull("Problem in get Category",categoryDAO.getCategory(2));
		}
		
		@Ignore
		@Test
		public void deleteCategoryTest()
		{
			Category category=categoryDAO.getCategory(2);
			assertTrue("Problem in Deletion:",categoryDAO.deleteCategory(category));
		}

		@Test
		public void updateCategoryTest()
		{
			Category category=categoryDAO.getCategory(3);
			category.setCategoryName("L Sofa Model");
			assertTrue("Problem in Updation",categoryDAO.updateCategory(category));
		}
		
		@Test
		public void listCategoriesTest()
		{
			List<Category> listCategories=categoryDAO.getCategories();
			assertNotNull("No Categories",listCategories);
			
			for(Category category:listCategories)
			{
				System.out.print(category.getCategoryId()+":::");
				System.out.print(category.getCategoryName()+":::");
				System.out.println(category.getCateogryDesc());
			}
		}
}
*/