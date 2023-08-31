
import java.util.*;

// exaple of compile time ploymorphism  
// paremeter are different
public class J_polymorphism{
    public static void main(String args[]){
        calculator calc = new calculator(); // creating new aboject of calculator
        System.out.println(calc.sum(1,2)); 
        System.out.println(calc.sum((float)1.2, (float) 1.5));
        System.out.println(calc.sum(1,2,3));
    }
} 


class calculator{
    int sum(int a , int b ){
        return a+b; 
    } 

    float sum(float a , float b){
        return a+b;
    } 

    int sum(int a, int b , int c ){
        return a+b+c;
    }
}