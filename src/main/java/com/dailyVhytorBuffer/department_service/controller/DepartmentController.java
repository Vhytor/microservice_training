package com.dailyVhytorBuffer.department_service.controller;

import com.dailyVhytorBuffer.department_service.model.Department;
import com.dailyVhytorBuffer.department_service.repository.DepartmentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);
    @Autowired
    private DepartmentRepository departmentRepository;


    @PostMapping()
    public Department add(@RequestBody Department department) {
        LOGGER.info("Adding department: {}", department);
        return departmentRepository.addDepartment(department);
    }
    @GetMapping()
    public List<Department> findAll(){
        LOGGER.info("Finding all departments");
        return departmentRepository.findAll();
    }
    @GetMapping("/{departmentId}")
    public Department findById( @PathVariable Long departmentId) {
        LOGGER.info("Finding department: id={}", departmentId);
        return departmentRepository.findById(departmentId);
    }
}
