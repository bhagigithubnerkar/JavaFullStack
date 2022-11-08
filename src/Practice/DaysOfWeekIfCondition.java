package Practice;

import java.util.Scanner;

public class DaysOfWeekIfCondition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int i = sc.nextInt();

        if ((i >= 1 && i <= 7)) {
            if (i == 1) {
                System.out.println("Sunday");
            }

            if (i == 2) {
                System.out.println("Monday");
            }

            if (i == 3) {
                System.out.println("Tuesday");
            }

            if (i == 4) {
                System.out.println("Wednesday");
            }

            if (i == 5) {
                System.out.println("Thursday");
            }

            if (i == 6) {
                System.out.println("Friday");
            }

            if (i == 7) {
                System.out.println("Saturday");
            }

        }
    }
}

