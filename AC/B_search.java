

import java.util.*;

public class B_search{ 

    public static boolean search(int arr[][], int key){
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==key){
                        System.out.println("found at cell (" + i + " ," +  j +")"); 
                        return true;
                }
            }
        } 
        System.out.println("key is not found"); 
        return false;
    }
    public static void main(String args[]){
        int arr[][] = new int [3][3]; 
        int n = arr.length; int m = arr[0].length; 
        Scanner sc = new Scanner(System.in); {
            for(int i= 0 ; i<n;i++){
                for(int j =0;j<m;j++){
                    arr[i][j] = sc.nextInt();
                }
            }
        }
        //output
        for(int i=0;i<n;i++){
            for(int j =0;j<m;j++){
                System.out.print(arr[i][j] + " ");
            } 
            System.out.println();
        } 
        search(arr, 5);
    }
}
