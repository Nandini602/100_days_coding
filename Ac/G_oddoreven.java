
public class G_oddoreven{

    public static void oddoreven(int n){
        int bitmask = 1;

        if((n & bitmask)  == 0){
            // even number 
            System.out.println("even number");
        } 
        else{
            System.out.println("odd number");
        }
    }
    public static void main(String args[]){
        oddoreven(5); 
        oddoreven(2); 
        oddoreven(10); 
        oddoreven(19); 

    }
}