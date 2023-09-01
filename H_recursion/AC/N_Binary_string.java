
// find the bineary string problem 

public class N_Binary_string{ 
    public static void  Printbinearystring(int n,int lastplace, String str){
        //base case 
        if(n ==0){
            System.out.println(str); 
            return ;
        } 
        Printbinearystring(n-1 ,0, str+"0"); 

        if(lastplace == 0){
            Printbinearystring(n-1 , 1 ,str+"1");
        }
    }
    public static void main(String args[]){
        Printbinearystring(3,0, "");
    }
}