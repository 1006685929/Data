package HashMap;

import java.util.HashMap;
import java.util.Hashtable;

public class Test {
    public static void main(String[] args) {

        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"Jack");
        System.out.println(hashMap.get(1));

        Hashtable<Integer,String> hashTable = new Hashtable<>();
        hashTable.put(2,"Tom");
        System.out.println(hashTable.get(2));
    }
}
