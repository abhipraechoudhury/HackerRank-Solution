import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner in = new Scanner(System.in);
        int i=1;

        /*
        - 'while' is another loop which will keep executing till the condition mentioned is true
        - hasNext() method tells us if there is anymore data left in the queue
        */
        while(in.hasNext()){
            System.out.println(i+" "+in.nextLine());
            i++;
        }
    }
}