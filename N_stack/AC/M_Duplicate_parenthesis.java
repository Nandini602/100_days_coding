  //all the parenthesis should be same 
  
import java.util.*;
public class M_Duplicate_parenthesis{ 
    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>(); 

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i); 

            //closing 

            if(ch ==')'){
                int count = 0;
                while(s.peek() != '('){
                    s.pop();
                    count ++;
                } 

                if(count < 1){
                    return true; //duplicate
                }else{
                    s.pop(); //opening pair
                } 

            } else{
                //opening 
                s.push(ch);
            }
        } 
        return false;
    }
    public static void main(String args[]){

        String str = "((a+b))";  //true
        System.out.println(isValid(str));
         String str1 = "(a+b)"; //false 
         System.out.println(isValid(str1));
    }
}