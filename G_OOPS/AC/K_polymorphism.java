
import java.util.*; 

public class K_polymorphism{

    public static void main(String args[]){

        Deer d = new Deer(); 
        d.eat();
    } 
} 

class Animal{
    void eat(){
        System.out.println("eats anything");
    }
} 

class Deer extends Animal{
    void eat(){
        System.out.println("eat grass");
    }
}