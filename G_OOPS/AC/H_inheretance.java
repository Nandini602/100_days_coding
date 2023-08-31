
import java.util.*; 

public class H_inheretance{

    public static void main(String args[]){
    
            Dog dobby = new Dog(); 
            dobby.eat(); 
            dobby.legs = 4; 
            System.out.println(dobby.legs);

    }  

}

    class Animal{
        String color(); 

        void eat(){
            System.out.println("eat");
        } 

        void breadth(){
            System.out.println("breadth");
        } 
    }  


    class mammal extends Animals{
        int legs;
    } 

    class Dog extends mammal {
        String breed;
    }
