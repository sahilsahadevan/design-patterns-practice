package com.example.sahil.design_patterns.structural.composite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Leaf of Base Component Department. This will not have any composite objects inside it.
public class RegionalSalesDepartment implements Department {
    private final Logger log = LoggerFactory.getLogger(RegionalSalesDepartment.class);

    private Integer id;
    private String name;

    // standard constructor, getters, setters
    public RegionalSalesDepartment(Integer id){
        this.id = id;
        this.name = getClass().getSimpleName();
    }

    @Override
    public void printDepartmentName() {
        log.info("- {}. {}", id, name);
    }
}
