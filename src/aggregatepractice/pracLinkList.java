package aggregatepractice;

import java.util.LinkedList;

public class pracLinkList {
    public static void main(String[] args) {
        LinkedList<String> linklist1 = new LinkedList<String>();
        linklist1.add("hello ");
        linklist1.addLast("world ");
        linklist1.addFirst("hi ");
        linklist1.add("!");
        System.out.println(linklist1);
        linklist1.removeFirst();//linklist1.remove();移除第一个
        linklist1.removeLast();
        System.out.println(linklist1.get(0) + linklist1.getLast());

    }
}
