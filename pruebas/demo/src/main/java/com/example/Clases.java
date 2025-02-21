package com.example;

public class Clases {
    private String name;
    private int age;
     
    public Clases(){}

    public Clases(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getname(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String toString(){
        return "Person [name="+name+", age="+age+"]";
    }

}
