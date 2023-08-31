
// constructor 

public class D_constructor{

    public static void main(String args[]){
        Student s1 = new Student("nandini");  
        System.out.println(s1.name);

    }
} 

class Student{
    String name; 
    int roll; 

    Student(String name){//constructor 
    this.name = name;

    }
}