
import java.util.*;

public class B_size{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>(); 
        list.add(1); 
        list.add(2);
        list.add(3); 
        list.add(4); 

        System.out.println("size of array is " + list.size()); 

        for(int i= 0 ;i<list.size();i++){
            System.out.println(list.get(i));
        } 

        System.out.println( );
    }
}