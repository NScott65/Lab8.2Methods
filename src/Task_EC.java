import java.util.Scanner;
public class Task_EC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double c = -100;
        boolean valid = false;



        System.out.printf("%-12s%10s\n", "Celsius", "Fahrenheit");

        for(double i = c; i <= 100; i++) {
            double converter = InputHelper.CtoF(i);
            System.out.printf("\n%-12.2f%10.2f", i, converter);
            System.out.println();

        }

    }
}
