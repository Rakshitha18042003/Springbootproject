package com.example.employee.dao;

import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.employee.entity.EmployeeEntity;
import com.example.employee.repository.EmployeeRepository;

public class EmployeeDao {
	@Autowired
	private EmployeeRepository employeeRepository;
	public List<EmployeeEntity> getEmployeeDetails(){
		return employeeRepository.findAll();
	}
	//public EmployeeEntity getEmployeeByID(String empID) {
		//Optional<EmployeeEntity> employee=employeeRepository.findById(empID);
		//return employee.orElseThrow(()->new RuntimeException("Employee not found"));
	}

//}
