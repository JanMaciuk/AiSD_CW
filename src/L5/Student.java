package L5;


public class Student {  //Klasa pomocnicza do zadania czwartego
    private String imie;
    private String nazwisko;
    private Integer numerIndeksu;
    private Integer rokStudiow;
    private boolean studiaStacjonarne;

    public Student(String imie, String nazwisko, int numerIndeksu, int rokStudiow, boolean studiaStacjonarne) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerIndeksu = numerIndeksu;
        this.rokStudiow = rokStudiow;
        this.studiaStacjonarne = studiaStacjonarne;
    }

    public String toString() {
        return "Student: " + imie + " " + nazwisko + ", numer indeksu: " + numerIndeksu + ", rok studiów: " + rokStudiow + ", studia stacjonarne: " + studiaStacjonarne;
    }

    public Integer getNumerIndeksu() {
        return numerIndeksu;
    }
    public void printStudent() {
        System.out.println(this);
    }

}
