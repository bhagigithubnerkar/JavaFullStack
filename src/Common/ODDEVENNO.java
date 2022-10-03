package Common;


import java.util.Scanner;

public class ODDEVENNO {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int no = Sc.nextInt();

        if (no % 2 ==0){
            System.out.println("Given no. is even");
        } else if (no % 2 != 0 ){
            System.out.println("Given no. is odd");
        }
    }
}
