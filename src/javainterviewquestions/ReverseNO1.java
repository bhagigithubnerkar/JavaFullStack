package javainterviewquestions;

import java.util.Scanner;

public class ReverseNO1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Original Number");
        int ONo = sc.nextInt();
        int RNo = 0;
        int r = 0;


        for (; ONo != 0; ONo /= 10) {
            r = ONo % 10;
            RNo = RNo * 10 + r;

        }
        System.out.println("Reversed Number :" + (RNo));
    }


}

