package L4;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] array = {76,71, 5, 57,12,50,20,93,20,55,62,3};
        sortowaniePrzezWstawienie(array);
    }
    public static void sortowaniePrzezWstawienie(int [] lista){ //Wersja z cześcią posortowaną po lewej
        System.out.println("Początkowy ciąg:");
        System.out.println(Arrays.toString(lista) + "\n");
        for(int i=0;i<lista.length;++i){
            boolean przesunieto = false;
            int j = i;

            while(j > 0 && lista[j-1]<lista[j]){

                int currentElement = lista[j];
                lista[j] = lista[j-1];
                lista[j-1] = currentElement;
                j = j-1;
                przesunieto = true;

            }
            if(przesunieto) { System.out.println("Przesunięto element: " + lista[j]); }
            else { System.out.println("Nie przesunięto"); }
            System.out.println("Posortowany ciąg do elementu: " + lista[i]);
            System.out.println(Arrays.toString(lista) + "\n");
        }
        System.out.println("Sortowanie zakończone");
    }
}
