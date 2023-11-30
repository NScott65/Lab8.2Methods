import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = InputHelper.getInt(scan, "Enter your favorite number: ");
        double num2 = InputHelper.getDouble(scan, "Enter your favorite number but w/ decimal: ");
        System.out.println("Your favorite int is: " + num1 + ". Your favorite double is: " + num2 + ".");


    }
}
