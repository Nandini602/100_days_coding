
import java.util.*;

public class I_hashset_iteration{
    public static void main(String args[]){
        HashSet<String> cities = new HashSet<>();
        cities.add("delhi");
        cities.add("mumbai");
        cities.add("noida");
        cities.add("nagpur");
        cities.add("bangaluru"); 

        // Iterator it = cities.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // } 

        for(String city: cities){
            System.out.println(city);
        }
    }
}