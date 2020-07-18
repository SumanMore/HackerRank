import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
           Scanner sc=new Scanner (System.in);
    
        int T=sc.nextInt();
        
        String S="";
        int J;
        for(J=0;J<T;J++)
        {
         S=sc.next();
         abc(S);
         
}
    }
static void abc(String s)
    {
        String s1="",s2="";
        int N=s.length();
        int i;
        for(i=0;i<N;i++)
        {
               char ch=s.charAt(i);
               
            if(i%2==0)
            { 
                s1=s1+ch;

            }
            else
            {
                  
                  s2=s2+ch;
            }}
            System.out.println(s1+" "+s2);
     
     
    }}
    
