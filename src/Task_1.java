import java.util.Scanner;
public class Task_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //To use InputHelper methods
        String x = InputHelper.getNonZeroLengString(scan, "Please enter your username: ");

        System.out.println(x);
    }
}
