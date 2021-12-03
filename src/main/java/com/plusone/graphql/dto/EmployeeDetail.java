package com.plusone.graphql.dto;

public class EmployeeDetail extends Employee {
    private Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
