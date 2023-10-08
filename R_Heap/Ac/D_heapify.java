
import java.util.*;

public class D_heapify{

    private void heapify(int i){
        int left = 2*i+1;
        int right = 2*i+2;
        int minIdx = i;

        if(left < arr.size() && arr.get(minIdx)> arr.get(left)){
            minIdx = left;
        }
        if(right < arr.size() && arr.get(minIdx)> arr.get(right)){
            minIdx = right;
        } 

        if(minIdx != i){
            //swap 
            int temp = arr.get(i);
            arr.set(i,arr.get(minIdx));
            arr.set(minIdx,temp);

            heapify(minIdx);
        }
    } 
    public int remove(){
        int data = arr.get(index 0);

        //step1 -swap first and last
        int temp =arr.get(0);
        arr.set(0,arr.get(arr.size()-1));
        arr.set(arr.size()-1;temp); 


        //step 2 -delete last 
        arr.remove(arr.size()-1);

        //step3  - heapify 
        heapify(0);
        return data;

    } 

    public boolean isEmpty(){
        return arr.size() == 0;
    }
}