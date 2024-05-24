import java.util.*;

public class main {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>(10);

        table.put(100, "Brian");
        table.put(123, "Mary");
        table.put(321, "Sandy");
        table.put(555, "Ian");
        table.put(777, "Kevin");
        
        //table.remove(777);

        for (Integer key : table.keySet()) {
            System.out.println(key.hashCode() % 10 + "\t" + key  + "\t" + table.get(key)); // Use the loop variable 'key' instead of 'Key'
        }
    }
}
