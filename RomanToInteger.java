import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Roman Number in capital letter: ");
        String romanNumber = sc.next();
        int result = romanToInt(romanNumber);
        System.out.println("Roman numeral " + romanNumber + " is equivalent to " + result);
    }

    public static int romanToInt(String s) {
        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentValue;

            switch (currentChar) {
                case 'I':
                    currentValue = 1;
                    break;
                case 'V':
                    currentValue = 5;
                    break;
                case 'X':
                    currentValue = 10;
                    break;
                case 'L':
                    currentValue = 50;
                    break;
                case 'C':
                    currentValue = 100;
                    break;
                case 'D':
                    currentValue = 500;
                    break;
                case 'M':
                    currentValue = 1000;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid Roman numeral");
            }

            result += (currentValue < prevValue) ? -currentValue : currentValue;
            prevValue = currentValue;
        }

        return result;
    }
}

