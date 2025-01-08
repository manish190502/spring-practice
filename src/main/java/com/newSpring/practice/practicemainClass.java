package com.newSpring.practice;

import com.newSpring.practice.entity.Department;

public class practicemainClass {
    public static void main(String[] args) {
        Department department = new Department();
        department.setDepartmentId(1L);
        department.setDepartmentName("HR");
        department.setDepartmentCode("HR001");
        department.setDepartmentAddress("New York");

        System.out.println(department);
    }
}
