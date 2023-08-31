
public class L_abstract{
    public static void main(String args[]){
       
       Mustang MyHorse = new Mustang(); 
       //Animal -> Horse -> Mustang
    }
} 

abstract class Animal{ 
    String color; 
        Animal(){ // constructor 
            System.out.println("animal constructor called");
            color ="brown";
        } 

        void eat(){
            System.out.println("animal eats");
        }
    
    abstract void walk(); // abstract class
}  

class Horse extends Animal{  

    Horse(){
        System.out.println("Horse constructor is called");
    }
    void changeColor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("walk on 4 legs");
    }
}  

class Mustang extends Horse{
    Mustang(){
        System.out.println("constructor is called..");
    }
}

class chicken extends Animal{
    void walk(){
        System.out.println("walk on 2 legs");
    } 
    void changeColor(){
        color = "black";
    }
}