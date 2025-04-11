package com.example.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee.dto.EmployeeDTO;
import com.example.employee.entity.EmployeeEntity;
import com.example.employee.mapper.EmployeeMapper;
import com.example.employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private EmployeeMapper employeeMapper;
	
	//@Override
	//public EmployeeEntity createEmployee(EmployeeEntity employee) {
		//return employeeRepository.save(employee);
		//}
	@Override
	public List<EmployeeEntity> getEmployeeDetails(){
		return employeeRepository.findAll();
	}
	
	public EmployeeEntity getEmployeeByID(String empID) {
		Optional<EmployeeEntity> employee=employeeRepository.findById(empID);
		return employee.orElse(null);
	}
	/*@Override
	public EmployeeEntity updateEmployee(String empID, EmployeeEntity employeeDetails) {
		if (employeeRepository.existsById(empID)) {
            employeeDetails.setEmpID(empID);
            return employeeRepository.save(employeeDetails);
        }
        return null;  
	}
	@Override 
	public void deleteEmployee(String empID) {
        employeeRepository.deleteById(empID);
    }*/
	//Create employee
	public EmployeeDTO addEmployee(EmployeeDTO dto) {
        EmployeeEntity updatedEntity = EmployeeMapper.toEntity(dto);
        EmployeeEntity savedEntity = employeeRepository.save(updatedEntity);
        return employeeMapper.toDTO(savedEntity);
	}
	// Update employee
    public EmployeeDTO updateEmployee(String empID, EmployeeDTO dto) {
       /* if (employeeRepository.existsById(empID)) {
            EmployeeEntity updatedEntity = EmployeeMapper.toEntity(dto);
            EmployeeEntity savedEntity = employeeRepository.save(updatedEntity);
            return employeeMapper.toDTO(savedEntity);
        }
        return null;*/
    	EmployeeEntity updateEmp = employeeRepository.findById(empID)
    	        .orElseThrow(() -> new RuntimeException("Employee not found"));

    	updateEmp.setEmpName(dto.getEmpName());
    	updateEmp.setAge(dto.getEmpAge());
    	updateEmp.setEmpDept(dto.getEmpDept());
    	EmployeeEntity saveEmp = employeeRepository.save(updateEmp);

    	return employeeMapper.toDTO(saveEmp);
    }
 
    // Delete employee
    public void deleteEmployee(String empID) {
        EmployeeEntity employee = employeeRepository.findById(empID).orElseThrow(() -> new RuntimeException("Employee not found"));
        employeeRepository.delete(employee);
    }
}