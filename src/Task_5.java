import java.util.Scanner;
public class Task_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String ssn = InputHelper.getRegExString(scan,"Enter your SSN(XXX-XX-XXXX): ","\\d{3}-\\d{2}-\\d{4}");
        System.out.println("Your SSN is: " + ssn + ".");
        String ucId = InputHelper.getRegExString(scan,"Enter your Student M Number(MXXXXX): ","(M|m)\\d{5}");
        System.out.println("Your Student M Number is: " + ucId + ".");
        String menu = InputHelper.getRegExString(scan, "Menu: O - Open S - Save V - View Q - Quit","[OoSsVvQq]");
        System.out.println("You choose: " + menu + ".");


    }
}
