package OOPS_JAVA;
import java.util.*;
public class student {
    // write the code of student class here
    int age;
    String name;

    void display() {
        System.out.println("My name is " + this.name + ". I am " + this.age + " " + "years old");
    }
    void sayHello(String name){

        System.out.println(this.name+" says hello to "+name);

    }
}
