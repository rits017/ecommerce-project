package com.example.componentscan.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan(basePackages = "com.example.componentscan.annotation")
public class AppConfig {
    //this class doesnot contain any methods or fields since this class is used to provide the configuration to the spring
    //there are two ways to provide configuration to spring
    //1.xml based configuration
    //2.annotation based configuration :this is what we are using here
    //@configuration is used to tell the spring that this is the class u can use to provide all the configuration

}
