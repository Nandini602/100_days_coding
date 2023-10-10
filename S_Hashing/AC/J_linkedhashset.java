
import java.util.*;

public class J_linkedhashset{
    public static void main(String args[]){
        HashSet<String> cities = new HashSet<>();
        cities.add("delhi");
        cities.add("mumbai");
        cities.add("noida");
        cities.add("nagpur");
        cities.add("bangaluru");  
        System.out.println(cities);


        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("delhi");
        lhs.add("mumbai");
        lhs.add("noida");
        lhs.add("nagpur");
        lhs.add("bangaluru"); 
        System.out.println(lhs);

        lhs.remove("delhi");
         System.out.println(lhs);



    }
}