
public class L_Abstraction{
    public static void main(String args[]){
        Horse h = new  Horse();  
        h.eat(); 
        h.walk(); 

        chicken c = new chicken(); 
        c.eat(); 
        c.walk(); 
        System.out.println(h.color);

        // Animal  a = new Animal();     we cannot create the abstract of the new
    }
} 

abstract class Animal{ 
    String color; 
     void eat(){
            System.out.println("animal eats");
        }
     abstract void walk(); // abstract class
}  

class Horse extends Animal{  
    
    void changeColor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("walk on 4 legs");
    }
} 

class chicken extends Animal{
    void walk(){
        System.out.println("walk on 2 legs");
    }
}