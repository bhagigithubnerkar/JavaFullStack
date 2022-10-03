package Set4A;

public class P1_2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 25;
        int e = 25;
        int f = 0;
        int g = 1;

      boolean rs = d>e;
      System.out.println("d is greater than e or not="+(rs));    //0
        rs = d<e;
        System.out.println("d is less than e="+(rs));            //0
        rs = d>=e;
        System.out.println("d is greater than or equal to e="+(rs));   //1
        rs = d<=e;
        System.out.println("d is less than or equal to b="+(rs));      //1
        rs = d==e;
        System.out.println("d is equal to e="+(rs));             //1
        rs = d!=e;
        System.out.println("d is not equal to e="+(rs));         //0

    }
}
