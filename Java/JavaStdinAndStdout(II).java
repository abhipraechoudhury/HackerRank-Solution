import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble(); // nextDouble() is used to input a decimal number from user
        String s = scan.nextLine(); // nextLine() is used to input a string from user

        /* 
        We have used nextLine() twice because after inputting any other datatype if we input string
        then it return a blank line
        */
        
        s = scan.nextLine();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}

