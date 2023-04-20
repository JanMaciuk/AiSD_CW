package L2;

import java.util.ArrayList;
import java.util.ListIterator;

public class task3 {
    protected static ArrayList<Integer> list3 = new ArrayList<>();
    protected static ListIterator<Integer> iterator3 = list3.listIterator();
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list2.add(11);
        list2.add(12);
        list2.add(13);
        list2.add(5);
        ListIterator<Integer> iterator1 = list1.listIterator();
        ListIterator<Integer> iterator2 = list2.listIterator();
        System.out.println(mixLists(iterator1, iterator2));

    }
    public static ArrayList<Integer> mixLists(ListIterator<Integer> iterator1, ListIterator<Integer> iterator2) {
        while(iterator1.hasNext() && iterator2.hasNext()) {
            iterator3.add(iterator1.next());
            iterator3.add(iterator2.next());
        }
        if (iterator1.hasNext() && !iterator2.hasNext()) {
            while(iterator1.hasNext()) {
                iterator3.add(iterator1.next());
            }
        }
        else if (!iterator1.hasNext() && iterator2.hasNext()) {
            while(iterator2.hasNext()) {
                iterator3.add(iterator2.next());
            }
        }
        return list3;
    }
}
