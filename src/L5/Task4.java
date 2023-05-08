package L5;

import java.util.Hashtable;

public class Task4 {
    /*
    Znajdź w bibliotece systemowej Javy kolekcję dla tablicy mieszającej.
    Pokaż, jak ją używać do przechowywania złożonych obiektów (takich jak Student itp.)
     */

    private static Hashtable<Integer, Student> studenci = new Hashtable<>(); // można podać początkowy rozmiar i maksymalny stopień wypełnienia.
    private static final Student student1 = new Student("Jan", "Kowalski", 1000, 1, true);
    private static final Student student2 = new Student("Adam", "Nowak", 2000, 2, false);
    private static final Student student3 = new Student("Anna", "Kowalska", 3000, 3, true);
    private static final Student student4 = new Student("Katarzyna", "Nowak", 4000, 4, true);
    private static final int szukanyIndex = 9000;
    private static final int indexDoUsuniecia = 2000;

    public static void main(String[] args) {
        //Demonstracja funkcjonalności Hashtable

        //Dodaje studentów używając numeru indeksu jako klucza
        studenci.put(student1.getNumerIndeksu(), student1);
        studenci.put(student2.getNumerIndeksu(), student2);
        studenci.put(student3.getNumerIndeksu(), student3);
        studenci.put(student4.getNumerIndeksu(), student4);

        studenci.forEach((index,Student) -> System.out.println(Student));

        if (studenci.containsKey(szukanyIndex)) {
            System.out.println("\nStudent o indeksie " + szukanyIndex + " istnieje");
        }
        else { System.out.println("\nStudent o indeksie " + szukanyIndex + " nie istnieje"); }


        System.out.println("W bazie danych znajduje się " + studenci.size() + " studentów.");


        if (studenci.remove(indexDoUsuniecia) == null) { // studenci remove zwraca null jeżeli dla podanego klucza nie jest przypisana żadna wartość.
            System.out.println("Student o indeksie " + indexDoUsuniecia + " nie znajdował się w bazie, więc nie został usunięty.");
        }
        else { System.out.println("Student o indeksie " + indexDoUsuniecia + " został usunięty."); }

    }

}
