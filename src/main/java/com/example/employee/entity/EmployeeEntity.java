package com.example.employee.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class EmployeeEntity {
	
	@Id
	private String empID;
	private String emp_name;
	@Column(name="emp_age")
	private int age;
	private String emp_dept;

	public EmployeeEntity(String empID, String empName, int empAge, String empDept) {
	}

	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmp_dept() {
		return emp_dept;
	}
	public void setEmp_dept(String emp_dept) {
		this.emp_dept = emp_dept;
	}


	public void setEmpName(String empName) {
	}

	public void setEmpDept(String empDept) {
	}

	public String getEmpName() {
        return "EmployeeName";
    }

	public String getEmpDept() {
        return "EmployeeDept";
    }
}
