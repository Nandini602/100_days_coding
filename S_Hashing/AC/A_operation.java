
import java.util.*;

public class A_operation{
    public static void main(String args[]){
        //create 

        HashMap< String,Integer> hm = new HashMap<>();

        //insert 
        hm.put("india" , 100);
        hm.put("china" , 150);
        hm.put("korea" , 10);
        hm.put("us" , 130);
        hm.put("uk" , 15); 

        System.out.println(hm); 

        //get -0(1) 
        int population = hm.get("india");
        System.out.println(population);
        System.out.println( hm.get("nepal")); 

        //containskey -0(1)
        System.out.println(hm.containsKey("india")); //true
        System.out.println(hm.containsKey("Ind"));//false 

        //remove 
        System.out.println(hm.remove("us"));
        System.out.println(hm); 

        //size 
        System.out.println(hm.size()); 

        //isempty 
        System.out.println(hm.isEmpty());

        //clear 
        hm.clear();

         //isempty 
        System.out.println(hm.isEmpty());



    }
}