import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {


    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        in.nextInt();
        int elevation = 0;
        int valleys = 0;
        String s=in.next();

       for(int i=0; i<s.length(); i++)
       {
           if(s.charAt(i)=='U')
           {
               elevation++;
           }
           else if(s.charAt(i)=='D')
           {
               if(elevation == 0)
               {
                   valleys++;
               }
               elevation--;
           }
       }

        System.out.println(valleys);
    }
}
