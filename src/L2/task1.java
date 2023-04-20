package L2;

import java.util.ArrayList;
import java.util.ListIterator;

public class task1 {


    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("1");
        list.add("2");
        ListIterator<String> iterator = list.listIterator();
        printElements(iterator);
    }


    public static void printElements(ListIterator<String> iterator) {
        ListIterator<String> drugiIterator = iterator;
        while(drugiIterator.hasNext()) {
            System.out.println(drugiIterator.next());
        }
    }

}
