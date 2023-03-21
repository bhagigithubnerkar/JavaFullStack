package Common;

/**
 * Specify the different sizes & values that can be stored in the variable.
 * Types:
 * 1.Primitive data type:
 * int,boolean,char,byte,short,long,float & double
 * <p>
 * 2.Non-primitive data type:
 * Classes,interface & arrays
 * <p>
 * Statistically-typed language means all variables need to be declared before use.
 **/

public class Datatypes {

    public static void main(String[] args) {

        boolean flag = true;    // 1 bit  //default false
        char c = 'A';  // 2 byte

        byte b = 127;  // 1 byte  -128 to 127  // default 0
        short s = 32767; // 2 byte  -32768 to 32767  // default 0
        int a = 10;  // 4 byte  -2147483648 to 2147483647  // default 0
        long l = 20L; // 8 byte  -2^63 to 2^63-1  // default 0

        float f = 2.5f;  // 4 byte unlimited // default 0.0
        double d = 10.5d; // 8 byte unlimited // default 0.0
    }
}
