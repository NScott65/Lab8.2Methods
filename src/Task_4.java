import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean valid = false;

        double total = 0;


        do {
            double price = InputHelper.getRangedDouble(scan,"Enter the item price: ",0.50, 9.99);
            String yn = InputHelper.getYNConfirm(scan,"Would you like to add a new price?");
            if(yn.equalsIgnoreCase("false")){
                valid = true;
            }
            total = total + price;
        }while(!valid);
        System.out.printf("%-20s%4.2f", "Your total in $ is: ", total);
    }
}
