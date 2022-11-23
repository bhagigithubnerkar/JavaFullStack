package Common;
/* print the pattern
 * * * *
 * * * *
 * * * *
 * * * *
 */
public class StarPattern {
    public static void main(String[] args) {

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //Infinite for loop
        for (; ; ) {
            System.out.println("Infinite Loop");
        }
    }
}
