package com.example.componentscan.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Employee {
private int employeeId;
@Value("hello")
private String firstName;
@Value("${java.home}")
private String lastName;
@Value("#{5*5}")
private double Salary;
public int getemployeeId(){
    return employeeId;
}
public String getfirstName(){
    return firstName;
}
public String getlastName(){
    return lastName;
}
public double getSalary(){
    return Salary;
}
public void setemployeeId(int id){
    this.employeeId=id;
}
public void setfirstName(String f){
    this.firstName=f;
}
public void setlastName(String l){
    this.lastName=l;
}
public void setSalary(double s){
    this.Salary=s;
}
public String toString(){
    return "Employee{"+"EmployeeId="+employeeId
                    +", firstName= '"+firstName+'\''+
                    ", lastName= '"+lastName+'\''+
                    ", Salary="+Salary+'}';
}

}
