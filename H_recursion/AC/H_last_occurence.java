 
 // find the last occureancev
public class H_last_occurence{ 
    public static int last_occurence(int arr[], int key,int i){

        if(i == arr.length){ //base case 
            return -1;
        } 

        int isfound = last_occurence(arr,key,i+1);
            if(isfound == -1 && arr[i] == key){
                return i;
            } 
            
          return isfound;
    }
    public static void main(String args[]){ 
        int arr[] = {5,5,5,5,5}; 
        System.out.println(last_occurence(arr,5,0));

    }
}