package pl.edu.ur.oopl5;

import java.util.Scanner;

public class Firma {

    Scanner x = new Scanner(System.in);
    Scanner z = new Scanner(System.in);
    String[][] tab = new String[100][4];
    Pracownik Pracownik = new Pracownik("", "", 0, "");
    String v = "tak";
    int k = 0;
    int i = 0;

    public void Nowy_Pracownik() {

        while (k < 100) {
            Pracownik pracownik = new Pracownik("", "", 0, "");
            tab[k][0] = "";
            if (v.equalsIgnoreCase("tak")) {
                System.out.println("Pracownik: " + (k + 1));
                System.out.println("Imie: ");
                pracownik.imie = z.nextLine();
                tab[k][0] = pracownik.imie;
                System.out.println("Nazwisko: ");
                pracownik.nazwisko = z.nextLine();
                tab[k][1] = pracownik.nazwisko;
                System.out.println("Wiek: ");
                pracownik.wiek = x.nextInt();
                tab[k][2] = Integer.toString(pracownik.wiek);
                System.out.println("Stanowisko: ");
                pracownik.stanowisko = z.nextLine();
                tab[k][3] = pracownik.stanowisko;
                System.out.println("Czy chcesz dalej uzupelniac tabele?");
                v = z.nextLine();
                k++;
            }
        }
    }

    public void pokazDane() {
        while (i < 100) {
            if (!"".equals(tab[i][0])) {
                System.out.println("Pracownik: " + (i + 1));
                System.out.println("Imie: " + tab[i][0]);
                System.out.println("Nazwisko: " + tab[i][1]);
                System.out.println("Wiek: " + tab[i][2]);
                System.out.println("Stanowisko: " + tab[i][3]);
                i++;
            }
            else
            {
                System.out.println("nie ma takiego pracownika");
            }
        }
    }
}
