import java.util.Scanner;

public class Exc1 {

    public static void main(String[] args) {
        final float MULTIPILIER = 1.8f;
        final float OFFSET = 32f;

        Scanner input = new Scanner(System.in);
        System.out.print("Podaj liczbę w stopniach C: ");
        float temp = input.nextFloat();
        input.nextLine();

        System.out.print(
            "Podana temperatura to " + (MULTIPILIER * temp + OFFSET) + "F"
        );

        input.close();
    }
}
