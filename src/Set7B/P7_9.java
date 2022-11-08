package Set7B;

public class P7_9 {
    public static void main(String[] args) {
        int i,j;
        for(i = 1; i < 100; i <<= 2){
            for(j = 4; j < 256; j <<= 3){
                System.out.println("i");
                System.out.println("j");
            }
            System.out.println();
        }

    }
}
