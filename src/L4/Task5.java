package L4;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] array = {76,71, 5, 57,12,50,20,93,20,55,62,3};
        bubbleSort(array);
    }
    static void bubbleSort(int[] lista) {
        System.out.println("Początkowy ciąg:");
        System.out.println(Arrays.toString(lista) + "\n");
        int size = lista.length - 1;

        for (int i = 0; i < size; i++) {

            for (int j = size; j > i; j--) { // > i bo porównujemy do elementów już posortowanych

                if (lista[j] > lista[j - 1]) {

                    int replacedElement = lista[j];
                    lista[j] = lista[j - 1];
                    lista[j - 1] = replacedElement;
                }
            }
            System.out.println("Posortowany ciąg do elementu: " + lista[i]);
            System.out.println(Arrays.toString(lista) + "\n");
        }
    }
}
