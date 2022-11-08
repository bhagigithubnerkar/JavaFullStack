package statickeyword;

import java.util.Scanner;

public class CalculateCube {
    static int cube(int no){
        return no * no * no;
    }
}


class CubeImpl{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int no = sc.nextInt();
        int res = CalculateCube.cube(no);
        System.out.println("Cube of "+ no +" is " +res);
    }
}
