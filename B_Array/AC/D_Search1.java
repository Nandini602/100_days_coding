


public class D_Search1{ 

    public static int linearsearch(String arr[] , String key){

        for(int i =0;i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        } 
        return -1;
    }
    public static void main(String args[]){
        String arr[] = {"dosa","idali", "samosa","tea"};  
        String  key = "samosa";  

        int  index = linearsearch (arr,key); 

        if(index == -1){
            System.out.println("key is not found");
        } 
        else{
            System.out.println("key is found at index " + index);
        }


    }
}


