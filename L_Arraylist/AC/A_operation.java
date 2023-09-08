
import java.util.*;

public class A_operation{
    public static void main(String args[]){
        ArrayList<Integer>list = new ArrayList<>(); // creating the array list

        //operation on array list 

        //add 
        list.add(1); 
        list.add(2); 
        list.add(3); 
        list.add(4); 
        list.add(5); 
        list.add(6);  

        System.out.println(list);  

        //Get   
         int ele = list.get(3);  // 3 is index number
        System.out.println(ele);   

        //remove 
        list.remove(3); 
        System.out.println(list); 

        //set element  
        list.set(2,10); 
        System.out.println(list); 


        //contain element 
        boolean ans =  list.contains(5); 
        System.out.println(ans);

 
    }
}