package pl.edu.ur.oopl5;

import java.util.Scanner;

public class Liczba {

    int liczba;
    Scanner x = new Scanner(System.in);

    public Liczba(int liczba) {
        this.liczba = liczba;
    }

    public int silnia(int k) {
        if (k == 0 || k == 1) {
            return 1;
        } else {
            return (silnia(k - 1) * k);
        }

    }

    public int rozmiar(int l) {
        int i = 0;
        while (l / 10 != 0) {
            l /= 10;
            i++;
        }
        return i;
    }
    int[] tab = new int[rozmiar(liczba)];

    void doTab(int liczba) {
        for (int i = 0; i <= rozmiar(liczba); i++) {
            tab[i] = liczba % 10;
            liczba = liczba / 10;
        }
    }

    void pobierzLiczbe() {
        System.out.println("Podaj liczbe");
        this.liczba = x.nextInt();
    }

    void wypiszLiczbe() {
        System.out.println("Ta liczba to: " + this.liczba);
    }
}
