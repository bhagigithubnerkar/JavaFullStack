package Set4A;

public class P1_1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 25;
        int e = 25;
        int f = 0;
        int g = 1;


       boolean rs = a > b;
        System.out.println("a is greater than b or not="+(rs));  //0
         rs = a < b;
        System.out.println( "a is less than b or not="+(rs));    //1
        rs = a>=b;
        System.out.println("a is greater than or equal to b or not="+(rs));
        //0
        rs = a<=b;
        System.out.println("a is less than or equal to b or not="+(rs));
        //1
        rs = a==b;
        System.out.println("a is equal to b or not="+(rs));      //0

        rs = a != b;
        System.out.println("a is not equal to b or not="+(rs));   //1

    }
}
