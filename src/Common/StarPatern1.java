package Common;
/* print the pattern
     *
     * *
     * * *
     * * * *
 */
public class StarPatern1 {
    public static void main(String[] args) {
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
