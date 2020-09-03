package aggregatepractice;

import java.util.*;

public class PracArrayList {
    public static void main(String[] args) {
        ArrayList<String> arraylist1 = new ArrayList<String>();
        arraylist1.add("hi");
        arraylist1.add("hello");
        arraylist1.add("world");
        Collections.sort(arraylist1);   //排序
        for (String str : arraylist1) {
            System.out.println(str);
        }
        arraylist1.set(0, "hello ");
        System.out.println(arraylist1.size());
        arraylist1.remove(2);
        for (String str : arraylist1) {
            System.out.println(str);
        }
        try {
            System.out.println(arraylist1.get(2));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception:" + e);
            return;
        }
    }

    public Map<String, String> aa(Map<String,String> a) {
        //int x = 0, y = 0;
        //return x,y;
        Map<String, String> dete = new HashMap<String, String>();
        return dete;
    }
}
