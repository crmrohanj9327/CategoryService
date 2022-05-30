package com.master.CategoryService.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(schema = "category", name = "category")
public class Category extends AuditableEntity{

	private String name;
	
	@Column(name = "parent_id", nullable = true)
	private String parentId;
	
	private String referenceEntity;
	
}
