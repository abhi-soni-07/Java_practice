//Even, Odd and for every 3rd position Palindrome number

import java.util.*;
public class PalindromeMan4 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int pos=0;
        for(int i=1;i<=no;i++)
        {
            int n=i;
            int temp=n;
            int rev=0,rem;
            while(n>0)
            {
                rem=n%10;
                rev=rev*10+rem;
                n=n/10;
            }
            if(temp==rev)
            {
                pos++;
                if(pos%2==0) {                                  // for odd if(pos %2!=0)
                    System.out.println(temp);                   // for every 3 Palindrome number if(pos%3==0)
                }
            }
        }
    }
}
