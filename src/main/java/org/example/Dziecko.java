package org.example;

public class Dziecko {
    private String name;
    private String lastName;
    private String birthDate;

    public Dziecko(String name, String lastName, String birthDate) {
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }
}
