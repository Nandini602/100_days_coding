

 // pq using jcf
import java.util.*;

public class A_add{
    public static void main(String args[]){
        //1,2,3,4,5 
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(7); 

        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}