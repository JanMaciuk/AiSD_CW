package L4;

import java.util.Arrays;

public class task6_7 {
    public static void main(String[] args) {
        shakerSort(new int[]{76, 71, 5, 57, 12, 50, 20, 93, 20, 55, 62, 3});
        shakerSort2(new int[]{76, 71, 5, 57, 12, 50, 20, 93, 20, 55, 62, 3});
    }
    public static void shakerSort(int[] lista) {
        System.out.println("podstawowa wersja bez ulepszeń (nawet sprawdzania czy ciąg już jest posortowany)");
        System.out.println("Początkowy ciąg:");
        System.out.println(Arrays.toString(lista) + "\n");
        int poczatkowyIndeks = 0;
        int koncowyIndeks = lista.length;
        while (Math.abs(poczatkowyIndeks - koncowyIndeks) > 1) { // jeżeli koniec i początek są obok siebie to ciąg jest posortowany

            System.out.println("do prawej");
            for (int i = poczatkowyIndeks; i < koncowyIndeks - 1; ++i) {
                if (lista[i] > lista[i + 1]) {
                    int temp = lista[i];
                    lista[i] = lista[i + 1];
                    lista[i + 1] = temp;

                }
            }
            System.out.println(Arrays.toString(lista) + "\n");

            koncowyIndeks--;

            System.out.println("do lewej");
            for (int i = koncowyIndeks - 1; i >= poczatkowyIndeks; i--) {
                if (lista[i] > lista[i + 1]) {
                    int temp = lista[i];
                    lista[i] = lista[i + 1];
                    lista[i + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(lista) + "\n");

            poczatkowyIndeks++;
        }
        System.out.println("Ciąg posortowany");
    }



    public static void shakerSort2(int[] lista) {
        System.out.println("Ulepszona wersja shaker sorta");
        System.out.println("Początkowy ciąg:");
        System.out.println(Arrays.toString(lista) + "\n");
        boolean zmiana = true;
        int poczatkowyIndeks = 0;
        int koncowyIndeks = lista.length;
        while (zmiana) {
            zmiana = false;

            System.out.println("do prawej");
            for (int i = poczatkowyIndeks; i < koncowyIndeks - 1; ++i) {
                if (lista[i] > lista[i + 1]) {
                    int temp = lista[i];
                    lista[i] = lista[i + 1];
                    lista[i + 1] = temp;
                    zmiana = true;

                }
            }
            System.out.println(Arrays.toString(lista) + "\n");
            if (!zmiana) { break;} // Jeżeli nic się nie zmieniło to ciąg musi być posortowany
            zmiana = false;
            koncowyIndeks--;

            System.out.println("do lewej");
            for (int i = koncowyIndeks - 1; i >= poczatkowyIndeks; i--) {
                if (lista[i] > lista[i + 1]) {
                    int temp = lista[i];
                    lista[i] = lista[i + 1];
                    lista[i + 1] = temp;
                    zmiana = true;
                }
            }
            System.out.println(Arrays.toString(lista) + "\n");

            poczatkowyIndeks++;
        }
        System.out.println("Ciąg posortowany");
    }
}
