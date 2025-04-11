package com.example.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee.entity.EmployeeEntity;
import com.example.employee.repository.EmployeeRepository;

@Service
public interface EmployeeService {
	@Autowired
	
	public List<EmployeeEntity> getEmployeeDetails();

}
