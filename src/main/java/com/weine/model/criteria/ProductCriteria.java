package com.weine.model.criteria;

public class ProductCriteria {
    private String name;

    public ProductCriteria(String name) {
        this.name = name;
    }

    public ProductCriteria() {
    }

    @Override
    public String toString() {
        return "ProductCriteria{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
