package com.master.CategoryService.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.master.CategoryService.entity.Category;
import com.master.CategoryService.repository.CategoryRepository;

@Repository
public class CategoryDAO {

	@Autowired
	private CategoryRepository categoryRepository;
	
	public Category getCategory(String id) {
		return categoryRepository.getById(id);
	}
	
	public boolean addCategory(Category category) {
		categoryRepository.save(category);
		return true;
	}
	
	public List<Category> getMainCategory() {
		return categoryRepository.findByParentIdIsNull();
	}
}
