package HashMap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Test {
    public static void main(String[] args) {

        HashMap<Integer,String> hashMap = new HashMap<>();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        //concurrentHashMap.put();
        hashMap.put(1,"Jack");
        System.out.println(hashMap.get(1));

        Hashtable<Integer,String> hashTable = new Hashtable<>();
        hashTable.put(2,"Tom");
        System.out.println(hashTable.get(2));
    }
}
