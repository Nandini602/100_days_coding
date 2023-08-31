
// constructor with parameter



public class E_cons{
    public static  void main(String args[]){
        Student s1 = new Student();  // non parameter 
        Student s2  = new Student("shradha");  //parameter 
        System.out.println(s1.name);
        Student s3 = new Student(123);
    }
} 

class Student {

    String name ;
    int roll; 

    Student(){
        System.out.println("constructor is called");
    } 

    Student(String name){
        this.name = name;
    } 

    Student(int roll){
        this.roll = roll;
    } 

    
}