package com.newSpring.practice.Controller;

import com.newSpring.practice.entity.Department;
import com.newSpring.practice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department){
        // Print the values of all fields in the department object
        System.out.println("Received Department:");
        System.out.println("Department Name: " + department.getDepartmentName());
        System.out.println("Department Address: " + department.getDepartmentAddress());
        System.out.println("Department Code: " + department.getDepartmentCode());
        System.out.println("Department ID: " + department.getDepartmentId());

        // Proceed with saving the department
        return departmentService.saveDepartment(department);
    }


    @GetMapping("/getDepartments")
    public List<Department> fetchDepartments(){
        return departmentService.fetchDepartmentsList();
    }

    @GetMapping("/getDepartments/{id}")
    public Department getDepartmentDetails(@PathVariable("id") Long departmentId){
        return departmentService.fetchDepartmentById(departmentId);
    }

    @DeleteMapping("/getDepartments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId)
    {
        departmentService.deleteById(departmentId);
        return "Department Deleted Succesfully";
    }
}
