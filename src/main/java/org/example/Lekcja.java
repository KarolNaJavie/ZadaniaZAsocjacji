package org.example;

public class Lekcja {
    private Jezyk jezyk;
    private Nauczyciel nauczyciel;
    private Student student;
    private String termin;

    public Lekcja(Jezyk jezyk, Nauczyciel nauczyciel, Student student, String termin) {
        this.jezyk = jezyk;
        this.nauczyciel = nauczyciel;
        this.student = student;
        this.termin = termin;
        student.dodajLekcje();
        nauczyciel.dodajLekcje();
    }

    public Jezyk getJezyk() {
        return jezyk;
    }

    public Nauczyciel getNauczyciel() {
        return nauczyciel;
    }

    public Student getStudent() {
        return student;
    }

    public String getTermin() {
        return termin;
    }
}
