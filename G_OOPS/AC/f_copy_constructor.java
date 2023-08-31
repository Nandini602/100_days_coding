
import java.util.*;

public class f_copy_constructor{

    public static void main(String args[]){
        Student s1 = new Student(); //creating the constructor
        s1.name = "nandini"; 
        s1.roll = 456; 
        s1.password = "abcd"; 
        s1.marks[0] = 100; 
        s1.marks[1] = 90; 
        s1.marks[2]=80; 

        Student s2 = new Student(s1); // new s1 is created and it is assingn to the s2
        s2.password = "xyz";  

        for(int i =0; i<3; i++){
            System.out.println(s2.marks[i]);
        }
    } 
} 


class Student {
    String name; 
    int roll; 
    String password; 
    int marks[];
    Address add;

    class Address{
        String city;
    }

    // copy constructor
    Student(Student s1){ 
        int marks[] = new int[3];
        this.name = s1.name; 
        this.roll = s1.roll; 
        this.marks = s1.marks;
    } 

    Student(){
        marks[] = new int[3];
        System.out.println("student");
    } 

    Student(String name){
        marks = new int[3]; 
        this.name = name;
    } 

    Student(int roll){
        marks = new int[3]; 
        this.roll = roll;
    }
}