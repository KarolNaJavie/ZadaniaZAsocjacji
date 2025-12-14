package org.example;

public class Student {
    private String imie;
    private String nazwisko;
    private Jezyk wybranyjezyk;
    private Nauczyciel nauczycielProwadzacy;
    private int liczbaLekcji = 0;

    public Student(String imie, String nazwisko, Jezyk wybranyjezyk) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wybranyjezyk = wybranyjezyk;
    }

    public void przypiszNauczyciela(Nauczyciel nauczyciel) {
        if (nauczyciel.getJezykiNauczane().contains(wybranyjezyk)) {
            nauczycielProwadzacy = nauczyciel;
            nauczyciel.dodajStudenta(this);
        } else {
            System.out.println("wybrany nauczyciel nie naucza jezyka danego ucznia");
        }
    }

    public void dodajLekcje() {
        liczbaLekcji++;
    }

    public int getLiczbaLekcji() {
        return liczbaLekcji;
    }

    @Override
    public String toString() {
        return imie + " " + nazwisko;
    }
}
