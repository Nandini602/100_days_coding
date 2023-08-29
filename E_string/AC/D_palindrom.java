//check the string is  the palindrom or not

public class D_palindrom { 

    public static Boolean palindrome(String str){
        for(int i =0;i<str.length()/2 ;i++){
            int n = str.length(); 
            if(str.charAt(i) != str.charAt(n-1-i)){
                // not palindrome 

                return false;
            }
        } 
        return true;
    }
    public static void main(String args[]){
        String str = "nandini";
       System.out.println( palindrome(str));
    }
}
