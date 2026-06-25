package car.example.bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;


//application context and bean factory are the two types of spring container and application context is a more advanced container
public class App{
public static void main(String[] args) {
    ApplicationContext context=new 
     ClassPathXmlApplicationContext("applicationBeanContext.xml");
     MyBean myBean=(MyBean)context.getBean("myBean");
     System.out.println(myBean);
}

}
