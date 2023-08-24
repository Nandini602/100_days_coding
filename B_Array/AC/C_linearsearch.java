
//find the index of element in the given array 


 
public class C_linearsearch{ 

    public static int search(int arr[],int key)
    {
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return i; 
            }
 
            
        }
        return -1;
    }
    public static void main(String args[]){
       int arr[] = {12,3,4,78,90,34,10};
        int key = 10; 
         int index=search(arr,key); 

         if( index ==-1){
            System.out.println("NOT FOUND");
         } 
         else{
            System.out.println("key is found at index " + index);
         }

    
    }
}