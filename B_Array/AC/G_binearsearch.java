// bineary search
//import java.util.*;

public class G_binearsearch{ 

    public static int  binearysearch(int arr[], int key){

        for(int i =0;i<arr.length;i++){
            if(arr[i] == key){
                return i;
            } 
            
        } 
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {2,4,6,8,10,12,14}; 

        int key = 4; 

       int result =  binearysearch(arr , key); 

        if(result == -1){
            System.out.println("key is not found");
        } 
        else{
            System.out.println("key is found at index  " +result  );
        }
    }
}