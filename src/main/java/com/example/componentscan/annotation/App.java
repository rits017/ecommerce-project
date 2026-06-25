package com.example.componentscan.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    //ApplicationContext is an interface which has a lot of implementation,to load the xml based configuration we use new ClassPathXMLApplicationContext
    //to use the annotation based configuration we use this
public static void main(String[] args) {
    ApplicationContext context=new 
                                AnnotationConfigApplicationContext("com.example.componentscan.annotation");
                                 //agar tumhe cast nhi krna object to dusra parameter ma class name de skte ho
        Employee employee=context.getBean("employee",Employee.class);
        System.out.println(employee.toString());
}
}
