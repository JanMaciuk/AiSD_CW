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
        printElemeents(iterator);
    }





    public static void printElemeents(ListIterator<String> iterator) {
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
