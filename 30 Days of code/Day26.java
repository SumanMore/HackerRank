import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int Da,Ma,Ya,De,Me,Ye;
        int fine=0;
        Da=sc.nextInt(); Ma=sc.nextInt(); Ya=sc.nextInt();
        De=sc.nextInt();  Me=sc.nextInt();  Ye=sc.nextInt();
        if(De>=Da && Me>=Ma && Ye>=Ya)
        fine=0;
        else if(De<Da && Ma==Me && Ya==Ye)
        fine=15*(Da-De);
        else if(Me<Ma && Ya==Ye)
        fine=500*(Ma-Me);
        else if(Ya>Ye)
        fine=10000;
        System.out.println(fine);


        

    }
}
