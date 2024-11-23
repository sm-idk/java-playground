import java.util.Scanner;

public class Exc2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę: ");
        int var1 = input.nextInt();
        System.out.print("Podaj drugą liczbę: ");
        int var2 = input.nextInt();
        System.out.print("Podaj trzecią liczbę: ");
        int var3 = input.nextInt();
        input.nextLine();

        int max = var1;
        if (var2 > max) {
            max = var2;
        }
        if (var3 > max) {
            max = var3;
        }

        int min = var1;
        if (var2 < min) {
            min = var2;
        }
        if (var3 < min) {
            min = var3;
        }

        System.out.println("Najwieksza liczba to: " + max);
        System.out.println("Najmniejsza liczba to: " + min);

        input.close();
    }
}
