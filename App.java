import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("podaj liczbę: ");
        number = input.nextInt();
        input.nextLine();

        for (int n = 1; n <= number; n++) {
            for (int i = 1; i <= number; i++) {
                if (i == number) {
                    System.out.print(i + "\n");
                } else {
                    System.out.print(i + ", ");
                }
            }
        }
        input.close();
    }
}
