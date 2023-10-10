

//iteration on hashmap 

import java.util.*;

public class B_iteration{
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

        //entryset
        Set<String> key = hm.keySet();
        System.out.println(key);


        for(String k: key){
            //if(max < k)
            System.out.println("key = " +k+ ", value = " + hm.get(k));
        }

 }
 }