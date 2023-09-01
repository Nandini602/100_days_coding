
// tilling problem 

public class K_tilling_problem{

    public static int tillingproblem(int n)
        { // 2 * n (floor size) 

            //base case 
            if(n ==0 || n ==1){
                return 1 ;
            }  

            // kaam 

            // vertical choice 
            int fnm1 = tillingproblem(n-1);  

            // horizontal chioce 
            int fnm2 = tillingproblem(n-2); 

            int totways = fnm1 + fnm2 ; 
            return totways;
        } 

        public static void main(String args[])
        {
            System.out.println(tillingproblem(4));
        }
}