package aggregatepractice;

import java.util.HashSet;
import java.util.Iterator;

public class PracHashSet {
    public static void main(String[] args) {
        HashSet<String> hashset1 = new HashSet<String>();
        hashset1.add("d");
        hashset1.add("hash");
        hashset1.add("set");
        //hashset1.remove("d");
        //hashset1.clear(); 删除所有元素
        System.out.println(hashset1 + " " + hashset1.contains("d") + " " + hashset1.size());
        for (String i : hashset1) {
            System.out.println(i);
        }
        Iterator<String> iter = hashset1.iterator();
        while (iter.hasNext()) {
            String i = iter.next();
            System.out.println(i);
            if (i == "d") {
                iter.remove();
            }
        }
        System.out.println(hashset1);
    }
}