import java.util.Scanner;

public class FullDate {
    public static void main (String[] args) {
        int month = 0;
        int day = 0;
        int year = 0;
        String monthName;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a month (mm): ");
        month = input.nextInt();

        System.out.print("Enter a day (dd): ");
        day = input.nextInt();

        System.out.print("Enter a year (yy): ");
        year = input.nextInt();

        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "INVALID_INPUT";
                break;
        }

        System.out.println("It is " + monthName + " " + day + ", 20" + year);


    }
}
