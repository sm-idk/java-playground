import java.util.Scanner;

public class Exc3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj cene (100-10000): ");
        double cena = input.nextDouble();
        while (cena < 100 || cena > 10000) {
            System.out.print(
                "Cena musi byc miedzy 100 a 10000. Sprobuj ponownie: "
            );
            cena = input.nextDouble();
        }

        System.out.print("Podaj liczbe rat (6-48): ");
        int raty = input.nextInt();
        while (raty < 6 || raty > 48) {
            System.out.print(
                "Liczba rat musi byc miedzy 6 a 48. Sprobuj ponownie: "
            );
            raty = input.nextInt();
        }

        float oprocentowanie = 0.025f;
        if (raty >= 13 && raty <= 24) {
            oprocentowanie = 0.05f;
        } else if (raty >= 25 && raty <= 48) {
            oprocentowanie = 0.10f;
        }

        double odsetki = cena * oprocentowanie;
        double lacznie = cena + odsetki;
        double miesiecznie = lacznie / raty;

        System.out.println("Kwota: " + cena + "zl");
        System.out.println("Ilosc rat: " + raty);
        System.out.println("----------------------");
        System.out.println("Odsetki: " + odsetki + "zl");
        System.out.println("Laczny koszt: " + lacznie + "zl");
        System.out.println("Miesiecznie: " + miesiecznie + "zl");
        input.close();
    }
}
