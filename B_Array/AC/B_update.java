

public class B_update{ 

    public static void update(int arr[], int nonchangable){
        nonchangable = 10; 
        for(int i =0 ;i<arr.length;i++){
            arr[i] =  arr[i] + 1; 

        }
    }
    public static void  main(String args[]){
        int arr[] = { 12,13,14,15}; 

        int nonchangable = 5 ; 
        update(arr,nonchangable); 

        for(int  i =0;i<arr.length;i++){
            System.out.println(arr[i]+ " ");
        } 

        System.out.println(nonchangable);
    }
}