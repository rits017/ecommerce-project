package com.example.componentScan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context=new 
                                 ClassPathXmlApplicationContext("componentScanDemo.xml");
                                 //agar tumhe cast nhi krna object to dusra parameter ma class name de skte ho
        Employee employee=context.getBean("employee",Employee.class);
        System.out.println(employee.toString());
    }

}
