package AnimalHierarchy;

import java.sql.SQLOutput;

public class Animal {
    private String name;
    private  int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void makeSound(){
        System.out.println("Making animal sound");

    }
}
