package L4;

import java.util.Arrays;

public class Task4Right {
    public static void main(String[] args) {
        int[] array = {76,71, 5, 57,12,50,20,93,20,55,62,3};
        sortowaniePrzezWybor(array);
    }
    static void sortowaniePrzezWybor(int[] lista) { // Wersja z częścią posortowaną po lewej
        System.out.println("Początkowy ciąg:");
        System.out.println(Arrays.toString(lista) + "\n");
        int length = lista.length;

        for (int sortedIndex = length-1; sortedIndex > 0; --sortedIndex)  {
            int maxIndex = sortedIndex;

            for (int sprawdzanyIndex = sortedIndex-1; sprawdzanyIndex >= 0; sprawdzanyIndex--) {
                if (lista[sprawdzanyIndex] > lista[maxIndex]) { // Szukam największego elementu
                    maxIndex = sprawdzanyIndex;
                }
            }

            int replacedElement = lista[maxIndex]; // Zamieniam największy element z następnym nieposortowanym.
            lista[maxIndex] = lista[sortedIndex];
            lista[sortedIndex] = replacedElement;
            System.out.println("Posortowany ciąg do elementu: " + lista[sortedIndex]);
            System.out.println(Arrays.toString(lista) + "\n");
        }
        System.out.println("Sortowanie zakończone");
    }
}
