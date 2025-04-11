package com.example.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.entity.EmployeeEntity;
import com.example.employee.service.EmployeeService;

@RestController
@RequestMapping(path="employee/")

public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping
	public ResponseEntity<List<EmployeeEntity>> getAllEmployees(){
		return new ResponseEntity<>(employeeService.getEmployeeDetails(), HttpStatus.OK);
				
	}
	

}
