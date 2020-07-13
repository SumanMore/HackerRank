
import java.util.*;
import java.io.*;

class  Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int s=0;
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            s=a+(int)(Math.pow(2,0)*b);
              System.out.print(s+" ");
            for (int x=2;x<=n;x++)
            {s=s+(int)(Math.pow(2,x-1)*b);
            System.out.print(s+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
