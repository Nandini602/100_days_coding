
public class G_Inheritance{
public static void main(String args[]){ 
    fish shark = new fish();
    shark.eat();

}  
}

// Base class 
class Animal{
    String color; 
     void eat(){
        System.out.println("eat");
     } 

     void breadth(){
        System.out.println("Breadth");
     } 

} 

//Derived class 

class fish extends Animal{

    int fins; 
    void swim(){
        System.out.println("swims in water");
    }
}
