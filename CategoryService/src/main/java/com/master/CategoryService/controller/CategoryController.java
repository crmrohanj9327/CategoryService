package com.master.CategoryService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.master.CategoryService.dto.CategoryDTO;
import com.master.CategoryService.service.CategoryService;

@RestController
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@GetMapping("category/{id}")
	public CategoryDTO getCategory(@PathVariable(name = "id") String id) {
		System.out.println("id is " + id);
		return categoryService.getCategory(id);
	}

	@PostMapping("category/add")
	public ResponseEntity<String> addCategory(@RequestBody CategoryDTO categoryDTO) {
		categoryService.addCategory(categoryDTO);
		return ResponseEntity.ok().body("success");
	}
	
	@GetMapping("category")
	public List<CategoryDTO> getMainCategory() {
		return categoryService.getMainCategory();
	}

}
