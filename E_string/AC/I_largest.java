
// for a given set of String print the largest string

public class I_largest { 
    public static void main(String args[]){
        String Fruits[] = {"Apple","Mango","Banana"}; 

        String largest = Fruits[0]; 

        for(int i = 0;i<Fruits.length;i++){
            if(largest.compareTo(Fruits[i])<0){
                largest = Fruits[i];
            }

        } 

        System.out.println(largest);

    }   
    
}
