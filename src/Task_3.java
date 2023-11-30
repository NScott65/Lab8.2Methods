import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        int day = 0;
        Scanner scan = new Scanner(System.in);
        int year = InputHelper.getRangedInt(scan,"Enter Birth Year(1950-2010): ",1950, 2010);
        int month = InputHelper.getRangedInt(scan,"Enter Birth Month(1-12): ",1, 12);
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
             day = InputHelper.getRangedInt(scan, "Enter Birth Day(1-31): ", 1, 31);
        }else if(month == 4 || month == 6 || month == 9 || month == 11){
             day = InputHelper.getRangedInt(scan, "Enter Birth Day(1-30): ", 1, 30);
        }else{
             day = InputHelper.getRangedInt(scan, "Enter Birth Day(1-28): ", 1, 28);
        }
        int hours = InputHelper.getRangedInt(scan, "Enter Birth Hour(1-24): ", 1, 24);
        int minutes = InputHelper.getRangedInt(scan, "Enter Birth Minutes(1-59): ", 1, 59);
        System.out.printf("%-6s%4d","Year:", year);
        System.out.printf("\n%-6s%4d","Month:", month);
        System.out.printf("\n%-6s%4d","Day:", day);
        System.out.printf("\n%-6s%4d","Hours:", hours);
        System.out.printf("\n%-8s%4d","Minutes:", minutes);

    }
}
