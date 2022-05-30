package com.master.CategoryService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.master.CategoryService.Converter;
import com.master.CategoryService.dao.CategoryDAO;
import com.master.CategoryService.dto.CategoryDTO;
import com.master.CategoryService.entity.Category;

@Service
public class CategoryService implements Converter<Category, CategoryDTO> {

	@Autowired
	private CategoryDAO categoryDAO;

	public CategoryDTO getCategory(String id) {
		Category category = categoryDAO.getCategory(id);
		return this.toDto(category, CategoryDTO.class);
	}
	
	public boolean addCategory(CategoryDTO categoryDTO) {
		return categoryDAO.addCategory(this.fromDto(categoryDTO, Category.class));
	}
	
	public List<CategoryDTO> getMainCategory() {
		List<Category> categoryLst = categoryDAO.getMainCategory();
		return this.toDtoLst(categoryLst, CategoryDTO.class);
	}

}
