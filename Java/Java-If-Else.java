    import java.io.*;
    import java.util.*;
    import java.text.*;
    import java.math.*;
    import java.util.regex.*;

    public class Solution {

        public static void main(String[] args) {

            /*
            If-Else is used to execute a particular block of code only if the condition is satisfied.
            And if the 'if' condition is satisfied then the else block is not executed.
            */

            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt(); // inputting an integer       
            String ans="";

            // if the number is odd then this block will get executed
            if(n%2==1){
              ans = "Weird";
            }

            // if the number is not odd (even) then this block is executed
            else{
                if(n<5) // if the number is less than 5, then the result should be Not Weird
                    ans = "Not Weird";
                else if(n<=20) // to avoid too many if-else pairs we use else if
                    ans = "Weird";
                else
                    ans = "Not Weird";
            }
            System.out.println(ans);
            
        }
    }

