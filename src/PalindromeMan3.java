//Highest and Lowest Palindrome number within range

import java.util.*;
public class PalindromeMan3 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int l=sc.nextInt();
        int u=sc.nextInt();
        for(int i=l;i<=u;i++)           //for highest no for(int i=u;i>=l;i--)
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
                return;
            }
        }

    }
}
