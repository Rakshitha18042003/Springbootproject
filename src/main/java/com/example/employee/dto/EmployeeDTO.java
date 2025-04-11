package com.example.employee.dto;

public class EmployeeDTO {
    private String empID;
    private String empName;
    private int empAge;
    private String empDept;
 
    public EmployeeDTO() {}
 
    public EmployeeDTO(String empID, String empName, int empAge, String empDept) {
        this.empID = empID;
        this.empName = empName;
        this.empAge = empAge;
        this.empDept = empDept;
    }
 
    // Getters and Setters
    public String getEmpID() { return empID; }
    public void setEmpID(String empID) { this.empID = empID; }
 
    public String getEmpName() { return empName; }
    public void setEmpName(String empName) { this.empName = empName; }
 
    public int getEmpAge() { return empAge; }
    public void setEmpAge(int empAge) { this.empAge = empAge; }
 
    public String getEmpDept() { return empDept; }
    public void setEmpDept(String empDept) { this.empDept = empDept; }
}