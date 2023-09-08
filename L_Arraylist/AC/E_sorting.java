
import java.util.*;

public class E_sorting{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>(); 
        list.add(2); 
        list.add(3); 
        list.add(7);
        list.add(9);
        list.add(1); 


        System.out.println(list); 
        Collections.sort(list); 
        System.out.println(list); 

        //descending  
        Collections.sort(list,Collections.reverseOrder());  
         System.out.println(list);

        

    }
}