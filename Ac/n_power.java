
// check if the number is the power of 2 or not 
public class n_power{
public static boolean ispower(int n ){
    return(n &(n-1)) == 0; 
} 

public static void main(String args[]){
    System.out.println(ispower(15));
} 

}