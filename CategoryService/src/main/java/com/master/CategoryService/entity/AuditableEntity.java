package com.master.CategoryService.entity;

import java.sql.Date;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@MappedSuperclass
public class AuditableEntity {
	
	@Id
	private String id;
	
	private Date insertDate;
	private Date updateDate;
}
