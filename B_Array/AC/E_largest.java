
// find the largest element

//import java.util.*;

public class E_largest{ 

    public static int getlargest(int arr[]){
        int largest = Integer.MIN_VALUE; 

        for(int i=0;i<arr.length;i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        } 
        return largest;
    }
    public static void main(String args[]){
        int arr[] = {12,1543,45,89,400,865,43}; 

    

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] + " ");
        }  

        System.out.print("largest  " + getlargest(arr) );

        
    }
}