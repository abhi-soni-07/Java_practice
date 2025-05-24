//Palindrome number in Ascending and Descending order

import java.util.Scanner;

public class PalindromeMan1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        for(int i=1;i<=no;i++)                  //for Descending for(int i=no;i>=1;i--)
        {
            int n=i;
        int rev=0,rem;
        int temp=n;
        while(n>0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(temp==rev)
        {
            System.out.println(temp);

        }
        }
    }

}
