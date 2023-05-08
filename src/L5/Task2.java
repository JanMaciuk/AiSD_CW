package L5;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Task2 { // QuickSort
    /*
    Zaimplementuj algorytm sortowania szybkiego.
    Jeśli kolekcja w danym kroku ma więcej niż 100 elementów,
    wybierz losowo 3 elementy i jako piwot wybierz środkowy (po posortowaniu) z nich.
    Dla 100 lub mniej elementów wybierz losowo piwot.
     */

    public static void main(String[] args) {
        Integer[] array = getRandomArray(1000);
        System.out.print("Array pierwotny:   ");
        printArray(array);
        sort(array, 0, array.length-1);
        System.out.print("\nArray posortowany: ");
        printArray(array);

    }

    public static Integer[] getRandomArray(int lenght) {
        Integer[] array = new Integer[lenght];
        for (int i = 0; i < lenght; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(1,lenght*2);
        }
        return array;
    }

    public static void printArray(Integer[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }


    /*
    array to tablica, którą sortujemy
    start to indeks początkowy,
    end to indeks końcowy.
    */
    private static void sort(Integer[] array, int start, int end) {

        if (start < end) {
            int Index = partition(array, start, end);

            //Wywołuję sortowanie dla elementów mniejszych i większych od pivota, pivot jest już w dobrym miejscu.
            sort(array, start, Index-1);
            sort(array, Index+1, end);
        }
    }

    //partition wybiera losowego pivota i ustawia mniejsze elementy na lewo, a większe na prawo.
    private static int partition(Integer[] array, int start, int end) {
        int pivotIndex;
        if (array.length > 100) {
            // Aby wybrać pivota dla dużej listy, losuje 3 elementy i wybieram środkowy z nich.
            Integer[] pivotArray = new Integer[3];
            pivotArray[0] = array[ThreadLocalRandom.current().nextInt(start, end + 1)];
            pivotArray[1] = array[ThreadLocalRandom.current().nextInt(start, end + 1)];
            pivotArray[2] = array[ThreadLocalRandom.current().nextInt(start, end + 1)];
            sort(pivotArray, 0, 2);
            pivotIndex = Arrays.asList(array).indexOf(pivotArray[1]); // pivot to środkowy element z posortowanego pivotArray. (szukany po indeksie)
        }
        else {
            pivotIndex = ThreadLocalRandom.current().nextInt(start, end + 1); // Dla małych list po prostu losuje pivota.
        }


        int pivotValue=array[pivotIndex]; // Zamieniam pivot z ostatnim elementem zakresu (więc pivot jest na końcu)
        array[pivotIndex]=array[end];
        array[end]=pivotValue;

        int lesserIndex = start-1; // indeks zakresu mniejszych elementów (na początku -1 bo może nie być mniejszych elementów)
        for (int j = start; j < end; j++) { // Iteruje po całym zakresie.

            if (array[j] < pivotValue) {
                lesserIndex++; //Jeżeli obecny element jest mniejszy od pivota, zwiększam zakres mniejszych elementów.

                int iValue = array[lesserIndex];// zamieniam mniejszy element z obecnym (tym dla którego iterujemy)
                array[lesserIndex] = array[j];
                array[j] = iValue;
            }
        }
        lesserIndex++; // Zwiększam lesserIndex o 1, żeby wskazywał na pierwszy element większy od pivota. Mniejsze elementy są do lesserIndex-1 włącznie.
        /*
        Ustawiam pivot na odpowiednie miejsce:
        (pivot był ostatnim elementem, teraz zamieniam go z pierwszym większym od niego).
        Po zamianie mniejsze elementy są po lewo od pivota, a większe po prawo.
         */
        int biggerThanPivotValue = array[lesserIndex];
        array[lesserIndex] = array[end];  //array[end] to pivot przed zamianą
        array[end] = biggerThanPivotValue;

        return lesserIndex; // po zamianie lesserIndex będzie indeksem pivota.
    }
}
