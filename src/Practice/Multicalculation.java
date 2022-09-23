package Practice;

import javax.xml.soap.SOAPPart;
import java.sql.SQLOutput;

public class Multicalculation {
    public static void main(String[] args) {
        int a  = 8;
        int b = 2345;
        int c = 3;
        int add = (a+b);
        int divide = (a+b)/c;
        int modulo = ((a+b)/c)%5;
        int M= ((a+b)/c)%5*5;
        System.out.println( "Multiply=" +M);
        System.out.println((((8+2345)/3)%5)*5);






    }
}
