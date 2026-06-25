package com.example.autowired.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("manager")
public class Manager {
    private Employee employee;
//jha pe bhi hum chahte ha dependency automatic inject ho jaye agar us type ki bean spring manage kr rhi h to vha hum autowired annotation use krenge

//eg: this manager class has a dependency on class employee and this employee class is a bean which is managed by spring so to inject the dependency of employee over here we will use autowired annotation
   @Autowired
    public Manager(Employee employee){
        this.employee=employee;
    }
    public String toString(){
        return "Manager{"+ 
        "Employee= "+
        employee+ '}';
    }

}
