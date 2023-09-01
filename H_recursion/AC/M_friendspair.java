
// friends pairing 

public class M_friendspair{ 

    public static int friendsPairing(int n){
        //base case 
        if(n ==1 || n ==2){
            return n ;
        }

        //choice 

        //single 
        int fnm1 = friendsPairing(n-1); 

        //pair 
        int fnm2 = friendsPairing(n-2); 
        int pairways =(n-1) * fnm2; 

        //totalways 
        int totalways = fnm1 + pairways; 
        return totalways; 

        // shortform 
        // return friendsPairing(n-1) + (n-2) * friendsPairing(n-2);
    }
    public static void main(String args[]){ 

        System.out.println(friendsPairing(3));
    }
}