
// find the first occurance of an element in an array  
public class G_first_occureance{ 
    public static int first_occureance(int arr[], int key , int i){ 
        
        if(i ==arr.length){ // base case
            return -1;
        } 
        if(arr[i] == key){
            return i ;
        } 

        return first_occureance(arr,key,i+1);
    }
    public static void main(String args[]){
        int arr[] = {8,3,6,9,5,10,2,5,3};  // here i is the value of index
        
       System.out.println(first_occureance(arr, 5, 0));
    }
}