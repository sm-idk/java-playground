import java.util.Scanner;

public class Exc4 {

    public static void main(String[] args) {
        System.out.println("Podaj pierwszą liczbę:");
        Scanner input = new Scanner(System.in);
        float num1 = input.nextFloat();
        input.nextLine();

        System.out.println("Podaj działanie (+, -, *, /):");
        String operation = input.nextLine();

        System.out.println("Podaj drugą liczbę:");
        float num2 = input.nextFloat();
        input.nextLine();

        float result = 0;

        switch (operation) {
            case "+": {
                result = num1 + num2;
                break;
            }
            case "-": {
                result = num1 - num2;
                break;
            }
            case "*": {
                result = num1 * num2;
                break;
            }
            case "/": {
                result = num1 / num2;
                break;
            }
        }

        System.out.println("Wynik: " + result);
        input.close();
    }
}
