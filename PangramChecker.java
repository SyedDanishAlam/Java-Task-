import java.util.*;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String input = sc.next();
        boolean isPangram = isPangram(input);

        System.out.println(isPangram ? "The input is a pangram." : "The input is not a pangram.");
    }

    public static boolean isPangram(String input) {
        boolean[] alphabetPresent = new boolean[26];

        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if ('a' <= c && c <= 'z') {
                int index = c - 'a';
                alphabetPresent[index] = true;
            }
        }

        for (boolean isPresent : alphabetPresent) {
            if (!isPresent) return false;
        }
        
        return true;
    }
}


