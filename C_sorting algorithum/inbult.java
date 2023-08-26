
import java.util.*;

public class inbult
{
    public static void main(String args[]){
        int arr[] ={5,6,8,1};

    Arrays.sort(arr,2,4);
     for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] + "  ");
     }

     System.out.println( );

     Arrays.sort(arr); 
      for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] + "  ");
     }
     
    }
}