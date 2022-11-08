package Common;
/* print the pattern
     *        *
     *  *   * *
     *    *   *
     *        *
     *        *

*/

public class StarPattern13 {
    public static void main(String[] args) {
        int i1=0; int j1=0;
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                if(i==1 || j==5 || (i1==0 || j1==0) && i<=5/2){
                    System.out.println("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
