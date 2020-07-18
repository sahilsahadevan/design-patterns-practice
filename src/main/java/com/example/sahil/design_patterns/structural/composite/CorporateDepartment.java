package com.example.sahil.design_patterns.structural.composite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

// Level1 Composite
public class CorporateDepartment implements Department {
    private final Logger log = LoggerFactory.getLogger(CorporateDepartment.class);
    private final Integer id;
    private final String name;

    private final List<Department> childDepartments;

    public CorporateDepartment(Integer id) {
        this.id = id;
        this.name = getClass().getSimpleName();
        this.childDepartments = new ArrayList<>();
    }

    @Override
    public void printDepartmentName() {
        log.info("- {}. {}", id, name);
        childDepartments.forEach(Department::printDepartmentName);
    }

    public void addDepartment(Department department) {
        childDepartments.add(department);
    }

    public void removeDepartment(Department department) {
        childDepartments.remove(department);
    }
}