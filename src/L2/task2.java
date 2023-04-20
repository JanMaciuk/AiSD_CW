package L2;

import java.util.ArrayList;
import java.util.ListIterator;

public class task2 {
    public static void main(String[] args) {
        int elements = 12; //Ile elementów ciągu chcemy zwrócić (minimum 2)
        if (elements < 2) {
            System.out.println("Podaj liczbę większą od 2");
            return;
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        ListIterator<Integer> iterator = list.listIterator();
        System.out.println(1);
        System.out.println(1);
        for (int i = 0; i < elements-2; i++) {
            int next = 0;
            next += iterator.next();
            next += iterator.next();
            System.out.println(next);
            iterator.add(next);
            iterator.previous();
            iterator.previous();

        }
    }
}
