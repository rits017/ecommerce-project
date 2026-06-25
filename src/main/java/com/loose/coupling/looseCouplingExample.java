package com.loose.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class looseCouplingExample {

    public static void main(String[] args) {
        ApplicationContext context=new 
    ClassPathXmlApplicationContext("applicationLooseCoupling.xml");
    UserManager usermanager=(UserManager)context.getBean("umWithnewDatabaseProvider");
     UserManager usermanager1=(UserManager)context.getBean("umWithuserDatabaseProvider");
     UserManager usermanager2=(UserManager)context.getBean("umWithDatabaseProvider");
     usermanager.displayUserInfo();
     usermanager1.displayUserInfo();
     usermanager2.displayUserInfo();
    }

}
