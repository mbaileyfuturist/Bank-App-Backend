package com.dev.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="user_employment")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserEmployment {
	
	@Id
	@Column(name="employment_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="user_id")
	private int userId;

	private String employer;
	private String position;
	
	@Column(name="annual_salary")
	private double annualSalary;

}
