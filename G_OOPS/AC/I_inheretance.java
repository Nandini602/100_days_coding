
import java.util.*; 

//hierarchical inheretance

public class I_inheretance{
    public  static void main(string args[]){

            Dog dobby = new Dog(); 
            dobby.eat(); 
            dobby.legs = 4; 
            System.out.println(dobby.legs);
    } 

}

    class Animal(){
        String color; 

        void eat(){
            System.out.println("eats");
        } 

        void breadth(){
            System.out.println("breathes");
        }
    } 

    
    class mammal extends Animal{
        void walk(){
            System.out.println("walk");
        }
    } 

    class fish extends Animal{ 
        void fly(){
            System.out.println("swim");
        }
    } 

    class Bird extends Animals{
        void fly(){
            System.out.println("walk");
        }
    }
