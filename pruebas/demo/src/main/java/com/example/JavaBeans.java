package com.example;
import java.io.Serializable;
public class JavaBeans implements Serializable {
    private static final long serialVersionUID = 1L; 
    private String name;
    private int age;

    public JavaBeans(){}

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(int age){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    @Override
    public String toString(){
        return "person [name="+ name+", age="+ age+"]";
    }
}
