


public class bubblesort{ 

    public static void bubsort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    //swap 
                    int temp = arr[j];
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp;
                }
            }
        }
    } 

    public static void printele(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        } 
    
    }

    public static void main(String args[]){
        int arr[] = {12,4,5,8,3,9,0};  

        bubsort(arr); 
        printele(arr);

    
    }
}
