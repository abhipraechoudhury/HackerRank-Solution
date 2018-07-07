import java.util.*;
import java.security.*;

public class Solution {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in .nextInt();
        in.close();

        String s = ""+n; // you can just concatenate a string and an integer to convert, which results in a string

        if (n == Integer.parseInt(s)) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer.");
        }
    }
}