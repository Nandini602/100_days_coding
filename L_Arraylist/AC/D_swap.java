
import java.util.*;
public class D_swap{ 

    public static void Swap(ArrayList<Integer>list,int idx1, int idx2){
        int temp = list.get(idx1); 
        list.set(idx1, list.get(idx2)); 
        list.set(idx2, temp);
    }
    public static void main(String agrs[]){
        ArrayList<Integer> list = new ArrayList<>(); 
        list.add(2);
        list.add(5);
        list.add(8);
        list.add(4);
        list.add(12); 


        int idx1 = 3 ; int idx2 = 4;  
        System.out.println( "original list is " + list); 
        Swap(list,idx1,idx2); 
        System.out.println(list);


    }
}