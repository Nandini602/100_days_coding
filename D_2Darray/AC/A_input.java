
import java.util.*;


public class A_input{

    public static void main(String args[]){
       // Scanner sc = new Scanner(System.in); 
        int arr[][] = new int[3][3];

        int n = arr.length; 
        int m = arr[0].length; 
        
     Scanner sc = new Scanner(System.in); 
        for(int i =0 ;i<n;i++){
            for(int j =0; j<m ;j++){
                arr[i][j] = sc.nextInt(); 
            } 
        } 


        //output 

        for(int i =0 ; i<n ; i++){
            for(int j=0 ;j<m;j++){
                System.out.print(arr[i][j] + " ");
            } 
            System.out.println();
        }

    }
}