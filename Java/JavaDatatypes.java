import java.util.*;
import java.io.*;



class Solution{
    public static void main(String []argh)
    {
        long l = Long.MAX_VALUE; // initializing with the maximum value that can be stored in long
        int in = Integer.MAX_VALUE; // initializing with the maximum value that can be stored in int
        short s = Short.MAX_VALUE; // initializing with the maximum value that can be stored in short

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                //Complete the code

                /*
                Checking if the input value lies within the range of any other datatypes
                */
                if(x>=Short.MIN_VALUE && x<=s)System.out.println("* short");
                if(x>=Integer.MIN_VALUE && x<=in)System.out.println("* int");
                if(x>=Long.MIN_VALUE && x<=l)System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}

