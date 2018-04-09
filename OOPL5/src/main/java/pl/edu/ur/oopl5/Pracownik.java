package pl.edu.ur.oopl5;

import java.util.Scanner;

public class Pracownik {

    public String imie;
    public String nazwisko;
    public int wiek;
    public String stanowisko;
    Scanner x = new Scanner(System.in);

    public Pracownik(String imie, String nazwisko, int wiek, String stanowisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.stanowisko = stanowisko;
    }

}
