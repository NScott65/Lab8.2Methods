import java.util.Scanner;
public class Task_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = " ";
        System.out.println("Enter your Message: ");
        if(scan.hasNextLine()){
            input = scan.nextLine();
        }

        String msg = InputHelper.prettyHeader(input);
    }
}
