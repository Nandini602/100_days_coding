public class typepromotion {
    public static void main(String args[]){
        
        byte b = 5 ; 
        byte a = (byte)(b*2);  // b*2 is not allowed 
        System.out.println(a); 

        short u = 5; 
        byte t = 25; 
        char  c = 'c'; 
        double bt = (c+u+t); 

        System.out.println(bt);

    }
}
