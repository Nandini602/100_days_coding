
public class k_Subarray{ 

    public static void subarray(int arr[]){
            //start
        for(int i=0; i<arr.length;i++){ 
            //end
            for(int j=i+1 ;j<arr.length;j++){

                for(int k=i ;k<=j;k++){
                    System.out.print(arr[k] + " ");
                } 

                System.out.println();
            } 
            System.out.println();
        }
    }

    public static void main(String args[]){
        int arr[] = {2,4,6,8,10}; 

        subarray(arr);
    }
}