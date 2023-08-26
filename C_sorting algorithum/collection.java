// to print in reverse order

import java.util.*;

public class collection{

    public static void main(String args[]){
        Integer arr[] = {5,2,3,6,9}; 

        Arrays.sort(arr,Collections.reverseOrder());  

        for(int i= 0 ;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }

    }
}
