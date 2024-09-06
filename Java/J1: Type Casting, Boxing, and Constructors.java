import java.util.Scanner;

class NumberPair {
    // Constructor that takes two integers
    public NumberPair(int a, int b) {
        // Print the sum of two numbers
        System.out.println(a + b);
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two integers
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        // 1. Widening type casting (int to double)
        double widenedValue = (double) n1;
        System.out.println(widenedValue);

        // 2. Narrowing type casting (int to byte)
        byte narrowedValue = (byte) n2;
        System.out.println(narrowedValue);

        // 3. Boxing (int to Integer object)
        Integer boxedValue = n1;  // Autoboxing
        System.out.println(boxedValue);

        // 4. Unboxing (Integer object to int)
        int unboxedValue = boxedValue;  // Autounboxing
        System.out.println(unboxedValue);

        // 5. Variable Modifiers (final int constant)
        final int constantValue = 1000;
        System.out.println(constantValue);

        // 6. Constructor usage
        NumberPair pair = new NumberPair(n1, n2);

        // Close the scanner
        sc.close();
    }
}
