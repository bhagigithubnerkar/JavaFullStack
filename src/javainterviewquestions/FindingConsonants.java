package javainterviewquestions;

public class FindingConsonants {
    public static void main(String[] args) {
        String str = "Bhagyashri Chetan Nerkar";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o' & str.charAt(i) != 'u') {

                System.out.println("Given String Contains  " + str.charAt(i) + " at index " + (i));
            }

        }
    }
}
