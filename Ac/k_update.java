
public class k_update{

     public  static int clear(int n ,int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }

    public static int set(int n , int i){
        int bitmask = 1<<i; 
        return n|bitmask;
    }  

    public static int updateithbit(int n , int i ,int newbit){ 

        // one way to update

        // if(newbit == 0){
        //     return clear(n,i);
        // }
        // else{
        //     return set(n,i);
        // } 

        // other way to update 

        n = clear(n,i); 
        int bitmask = newbit<<i ; 
        return n | bitmask;
    }

    public static void main(String args[]){
            System.out.println(updateithbit(10, 2 , 1));
    }
}