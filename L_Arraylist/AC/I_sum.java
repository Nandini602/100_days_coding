
import java.util.*; 

public class I_sum{

    public static boolean pairsum(ArrayList <Integer> list,int target){

        for(int i = 0; i<list.size();i++){
            for(int j =i+1;j<list.size();j++){
                if(list.get(i) + list.get(j) == target){
                    return true;
                }
            }
        } 
        return false;
    }


    public static void main(String args[]){
        
        ArrayList <Integer> height = new ArrayList<>(); 

        //1,8,6,2,5,4,8,3,7 
        height.add(1); 
        height.add(8); 
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        
        int target = 9;
        System.out.println( pairsum( height, target));
    }
    }
