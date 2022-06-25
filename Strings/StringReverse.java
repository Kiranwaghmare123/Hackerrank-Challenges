import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
        String A = sc.next();
        sc.close();
        boolean found = true;
        for (int i = 0; i < A.length() / 2; i++) {
            if (A.charAt(i) != A.charAt(A.length() - 1 - i)) {
                found = false;
                break;
            }
        }
        System.out.println(found ? "Yes" : "No");
    }
}