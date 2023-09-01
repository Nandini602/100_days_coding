
// find the x^n 

public class J_power{  
    public static int optimizedpower(int a ,int n){ 

        //base case 
        if(n ==0){
            return 1;
        } 

        //for even number

       // int halfpowersq = optimizedpower(a,n/2) * optimizedpower(a,n/2);  

        int halfpower =  optimizedpower(a , n/2); 
        int halfpowersq = halfpower * halfpower;

        //for the odd number 
        if(n % 2 != 0){
             halfpowersq  = a * halfpowersq;
        } 

        return halfpowersq;


    }

    public static void main(String args[]){
        int a = 2; 
        int  n =10;  

        System.out.println(optimizedpower(a,n));

    }

}