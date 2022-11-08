package statickeyword;

import java.util.Scanner;

public class CalculateSimpleInterest {
    static float simpleInterest(float P,float R,float T){
        return ((P * R * T)/100);

    }
}
class SimpleInterestImpl{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float P = sc.nextFloat();
        System.out.println("Enter P");
        float R = sc.nextFloat();
        System.out.println("Enter R");
        float T = sc.nextFloat();
        System.out.println("Enter T");
        float res = CalculateSimpleInterest.simpleInterest(P,R, T);
        System.out.println("Simple Interest=" +(res));
    }
}
