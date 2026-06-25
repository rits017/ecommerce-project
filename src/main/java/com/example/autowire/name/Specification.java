package com.example.autowire.name;

public class Specification {
    private String make;
    private String model;

    public String getMake(){
        return make;
    }
    public String model(){
        return model;
    }

    public void setMake(String make){
       this.make=make;
    }
    public void setModel(String model){
        this.model=model;
    }

    public String toString(){
        return "Specification{"+
        "make='" + make + '\'' +
        ", model='" + model+ '\''+ "}";
    }

}
