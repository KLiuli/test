package aggregatepractice;

import java.util.HashMap;

public class PracHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hashmap1 = new HashMap<Integer, String>();
        hashmap1.put(1, "hello");
        hashmap1.put(3, "!");
        hashmap1.put(2, "world");
        hashmap1.put(2,"a");
        System.out.println(hashmap1 + " " + hashmap1.get(3) + " " + hashmap1.size());
        hashmap1.remove(3);
        //hashmap1.clear(); 删除所有键值对
        for (int i : hashmap1.keySet()) {
            System.out.println("key:" + i + " value:" + hashmap1.get(i));
        }
        System.out.println(hashmap1.values());
    }
}
