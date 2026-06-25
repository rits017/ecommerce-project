package com.example.autowire.constructor;

public class Car {
private Specification specification;
     
    public void setSpecification(Specification specification){
        this.specification=specification;
    }

    public String displayDetails(){
        return specification.toString();
    }
}
