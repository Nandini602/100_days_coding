
import java.util.*;

public class D_linkedHashMap{
    public static void main(String args[]){
        LinkedHashMap<String , Integer > lhm = new LinkedHashMap<>();
        lhm.put("India",100);
        lhm.put("us",10);
        lhm.put("china",150); 

        System.out.println(lhm);
    }
}