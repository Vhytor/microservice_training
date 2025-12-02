package com.dailyVhytorBuffer.department_service.model;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private Long department_id;
    private String department_name;

    public Long getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(Long department_id) {
        this.department_id = department_id;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    private List<Employee> employees = new ArrayList<>();

    public Department(Long department_id, String department_name) {
        this.department_id = department_id;
        this.department_name = department_name;
    }

    public Department() {
    }

    @Override
    public String toString() {
        return "Department{" +
                "department_id=" + department_id +
                ", department_name='" + department_name + '\'' +
                ", employees=" + employees +
                '}';
    }
}
