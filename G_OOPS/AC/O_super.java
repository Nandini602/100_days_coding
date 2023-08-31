

import java.util.*; 

public class O_super{

    public static void main(String args[]){
        Horse h = new  Horse(); 
        System.out.println(h.color);
    }

} 

class Animal{ 


    Animal(){
        System.out.println("animal constructor is called");
    }
} 

class Horse extends Animal{

    Horse(){
        super(); 
        System.out.println("horse constructor is called");
    }
}