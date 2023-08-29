// compare the two string



public class F_campare {
    
    public static void main(String args[]){
        String s1 = "Tony"; 
        String s2 = "Tony"; 
        String s3 = new String("Tony"); 

        if(s1 == s2){
            System.out.println("String are  equal");
        } 
        else{
            System.out.println("Strings are not equal");
        } 

        // sometime the these  == is not work so use the .equals 

        if(s1.equals(s3)){
            System.out.println("Strings are eqaul");
        } 
        else{
            System.out.println("Strings are not eqaul");
        }
    }

}
