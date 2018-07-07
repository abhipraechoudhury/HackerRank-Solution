import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        /*
        For printing table of a number, instead of writing 10 print statments we can use
        'for' loop which will execute one print statment 10 times.
        */
        for(int i=1;i<=10;i++)
            System.out.println(N+" x "+i+" = "+(N*i));
    }
}

