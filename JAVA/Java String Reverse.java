
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        /* Enter your code here. Print output to STDOUT. */
        String s="";
       for(int i=0;i<A.length();i++)
       {
           char ch=A.charAt(i);
           s=ch+s;
           
       }
       if(A.equals(s))
       {
           System.out.println("Yes");
       }
       else 
       {
           System.out.println("No");
       }
        
    }
}



