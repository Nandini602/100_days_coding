
//implementation of java using the hashmap 

import java.util.*;

public class C_implementation{ 

    static class HashMap<k,v>{//generic
    private class Node{
        k key;
        v value;

        public Node(k key ,v value){
            this.key = key;
            this.value = value;
        }
    }
        
    }
    public static void main(String args[]){
        HashMap<String,Integer> mp = new HashMap<>();
        hm.put("india",100);
        hm.put("china",10);
        hm.put("us",130);
        hm.put("nepal",150); 

        ArrayList<String> keys = hm.keySet();
        for(String key : keys){
            System.out.println(key);
        }
        System.out.println(hm.get("india"));
        System.out.println(hm.remove("india"));
        System.out.println(hm.get("india"));
    }
}