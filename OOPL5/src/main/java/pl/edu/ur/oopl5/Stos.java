package pl.edu.ur.oopl5;


import java.util.Scanner;

public class Stos {

    private int wskaznik = 0;
    int rozmiar;
    private int[] tab;
    Scanner x = new Scanner(System.in);

    public Stos(int n) {
        this.wskaznik = n;
        this.tab = new int[n];
    }

    public void pop() {
        if (wskaznik > 0) {
            tab[wskaznik] = 0;
            wskaznik--;
        } else {
            System.out.println("Pusty stos");
        }
    }
    public void push() {
        if (wskaznik < rozmiar)
        {
            System.out.println("Podaj liczbe ");
            tab[wskaznik] = x.nextInt();
        }
        else 
        {
            System.out.println("Pełny stos");
        }
    }
}
