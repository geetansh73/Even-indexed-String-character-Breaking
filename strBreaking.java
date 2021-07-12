import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        
        int t=sc.nextInt();
        while(t>0)
        {
        String s=sc.next();
        char arr[]=s.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
        if (i%2==0)
        {
    System.out.print(arr[i]);
        }
        }
        System.out.print(" ");
          for(int i=0;i<arr.length;i++)
        {
        if (i%2!=0)
        {
    System.out.print(arr[i]);
        }
        }
        t--;
        System.out.println();
        }
    }
}
