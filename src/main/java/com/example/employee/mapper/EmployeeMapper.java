package com.example.employee.mapper;
 
import org.springframework.stereotype.Component;

import com.example.employee.dto.EmployeeDTO;
import com.example.employee.entity.EmployeeEntity;
 
@Component
public class EmployeeMapper {
 
    public static EmployeeDTO toDTO(EmployeeEntity employee) {
        return new EmployeeDTO(
            employee.getEmpID(),
            employee.getEmpName(),
            employee.getAge(),
            employee.getEmpDept()
        );
    }
 
    
    public static EmployeeEntity toEntity(EmployeeDTO dto) {
        return new EmployeeEntity(
            dto.getEmpID(),
            dto.getEmpName(),
            dto.getEmpAge(),
            dto.getEmpDept()
        );
    }
}