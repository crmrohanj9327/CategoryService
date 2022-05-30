package com.master.CategoryService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.master.CategoryService.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, String> {
	
	List<Category> findByParentIdIsNull();

}
