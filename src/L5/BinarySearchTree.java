package L5;

public class BinarySearchTree {

    class Node {
        int value; // Wartość węzła
        Node left; // Wskaźnik na mniejszy węzeł
        Node right; // Wskaźnik na większy węzeł


        public Node(int value)
        {
            this.value = value;
            left = null;
            right = null;
        }
    }


    Node root = null; // Korzeń drzewa, na początku drzewo jest puste

    // Usuwanie zmienia drzewo, zwracam nowy korzeń.
    public void delete(int value) { root = deleteNode(root, value); }

    private Node deleteNode(Node node, int value)
    {
        // node to korzeń sprawdzanego poddrzewa, na początku całe drzewo, potem prawe/lewe itd.
        // Sprawdzam, czy drzewo nie jest puste.
        if (node == null)  { return null; }

        //Jeżeli szukana wartość jest inna od wartości obecnego elementu, to szukamy w poddrzewach.
        if (value < node.value)  { node.left = deleteNode(node.left, value); }
        else if (value > node.value)  { node.right = deleteNode(node.right, value); }

            // Jeżeli wartość nie jest różna, to znaleźliśmy element do usunięcia.
        else {

            // Proste sytuacje z tylko jednym potomkiem lub brakiem potomków.
            if (node.left == null)
                return node.right;
            if (node.right == null)
                return node.left;


            // Dla dwóch potomków zamieniam wartość z następnikiem (najmniejszym większym elementem)
            // Szukam wartość najmniejszego większego elementu
            Node checkedNode = node.right;
            int smallestBiggerValue = checkedNode.value;
            while (checkedNode.left != null) {
                smallestBiggerValue = checkedNode.left.value;
                checkedNode = checkedNode.left;
            }
            // Zamieniam wartość z następnikiem
            node.value = smallestBiggerValue;

            //Usuwam Node następnika (jego wartość jest skopiowana do obecnego elementu)
            node.right = deleteNode(node.right, node.value);
        }

        return node;
    }



    public void insert(int value) { root = insertNode(root, value); }


    private Node insertNode(Node node, int value)
    {
        // Kiedy dojdę do końca drzewa, dodaje nowy węzeł.
        if (node == null) {
            node = new Node(value);
            return node;
        }

        // przechodzę do odpowiedniego poddrzewa, jeżeli będzie ono null, to dodam nowy węzeł.
        if (value < node.value)
            node.left = insertNode(node.left, value);
        else if (value > node.value)
            node.right = insertNode(node.right, value);

        //Nie uwzględniam duplikatów, więc jeżeli wartość już istnieje, to nic nie robię.
        // zwracam drzewo
        return node;
    }

    public void print() {
        System.out.println("In order:");
        InOrderWalkPrint(root);
        System.out.println();
    }

    private void InOrderWalkPrint(Node root)
    { //Przegląd in-order, najpierw idę do końca w lewo po drzewie, wyświetlam wartość, i przechodzę do prawej wartości.
        if (root != null) {
            InOrderWalkPrint(root.left);
            System.out.print(root.value + " ");
            InOrderWalkPrint(root.right);
        }
    }

    public int size() {
        return InOrderWalkCount(root);
    }

    private int InOrderWalkCount(Node root) {
        if (root != null) {
            return InOrderWalkCount(root.left) + 1 + InOrderWalkCount(root.right);
        }
        return 0;
    }

    public int evenElements() {
        return InOrderWalkEvenCount(root);
    }

    private int InOrderWalkEvenCount(Node root) {
        if (root != null) {
            int count = 0;
            // Jeżeli wartość jest parzysta, to zwiększam licznik.
            if (root.value % 2 == 0) { count++; }
            return InOrderWalkEvenCount(root.left) + count + InOrderWalkEvenCount(root.right);
        }
        return 0;
    }

    public int oneChildElements() {
        return InOrderWalkOneChildCount(root);
    }

    private int InOrderWalkOneChildCount(Node root) {
        if (root != null) {
            int count = 0;
            // Jeżeli tylko jeden potomek jest null, to zwiększam licznik.
            if ((root.left == null && root.right != null) || (root.left != null && root.right == null)) { count++; }
            return InOrderWalkOneChildCount(root.left) + count + InOrderWalkOneChildCount(root.right);
        }
        return 0;
    }

    public int height() {
        return Height(root);
    }

    private int Height(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(Height(root.left), Height(root.right));
    }



}