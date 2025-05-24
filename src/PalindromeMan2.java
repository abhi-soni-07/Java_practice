//List of Odd and Even Palindrome number

import java.util.*;

public class PalindromeMan2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        for(int i=1;i<=no;i++) {
            int n = i;
            int rev = 0, rem;
            int temp = n;
            while (n > 0) {
                rem = n % 10;
                rev = rev * 10 + rem;
                n = n / 10;
            }
            if(temp==rev && temp%2==0)              //for Odd if(temp==rev && temp%2!=0)
            {
                System.out.println(temp);
            }
        }
    }
}
