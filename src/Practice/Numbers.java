package Practice;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int Num = sc.nextInt();

        if(Num > 0)
        {
            System.out.println("Num is positive");
        }
        else if(Num < 0)
        {
            System.out.println("Num is negative");
        }
        else{
            System.out.println("NUm is zero");
        }
    }
}
