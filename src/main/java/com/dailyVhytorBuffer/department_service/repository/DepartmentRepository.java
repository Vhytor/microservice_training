package com.dailyVhytorBuffer.department_service.repository;

import com.dailyVhytorBuffer.department_service.model.Department;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DepartmentRepository {

    private List<Department> departments = new ArrayList<Department>();

    public Department addDepartment(Department department) {
        departments.add(department);
        return department;
    }
    public Department findById(Long departmentId){
        return departments.stream()
                .filter(department -> department.getDepartment_id().equals(departmentId))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Department not found"));
    }
    public List<Department> findAll(){
        return departments;
    }
}
