package L5;

public class Task5_7 {
    public static void main(String[] args) {
        //Zrobione zadanie 5 i zadanie 7 podpunkty a,b,c,d.
        // Nie wiem co to jest brat węzła do podpunktu e.
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(20);
        bst.insert(7);
        bst.insert(10);
        bst.insert(25);
        bst.insert(4);
        bst.insert(1);
        bst.insert(2);
        bst.insert(12);
        bst.insert(30);

        System.out.println("Drzewo przed usuwaniem:");
        bst.print();
        System.out.println("Rozmiar drzewa: " + bst.size());
        System.out.println("Wysokość drzewa: " + bst.height());
        System.out.println("Ilość parzystych wartości w drzewie: " + bst.evenElements());
        System.out.println("Ilość węzłów z jednym potomkiem: " + bst.oneChildElements());

        bst.delete(12);
        bst.delete(1);
        bst.delete(20);

        System.out.println("\nPo usunięciu 12, 1, 20:");
        bst.print();
        System.out.println("Rozmiar drzewa: " + bst.size());
        System.out.println("Wysokość drzewa: " + bst.height());
        System.out.println("Ilość parzystych wartości w drzewie: " + bst.evenElements());
        System.out.println("Ilość węzłów z jednym potomkiem: " + bst.oneChildElements());


    }
}
