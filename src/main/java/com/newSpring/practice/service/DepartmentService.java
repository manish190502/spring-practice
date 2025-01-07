package com.newSpring.practice.service;

import com.newSpring.practice.entity.Department;

import java.util.List;

public interface DepartmentService {
    public List<Department> fetchDepartmentsList();

    public Department saveDepartment(Department department);

    public Department fetchDepartmentById(Long departmentId);

    public void deleteById(Long departmentId);
}
