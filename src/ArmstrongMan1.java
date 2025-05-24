//Armstrong number in Ascending and Descending order

import java.util.Scanner;

public class ArmstrongMan1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=1000;i++) {                 //for Descending for(i=200;i>=1;i--)
            int n=i;
            int count = 0;
            int sum = 0;
            int temp = n;
            int rem;
            while (n > 0) {
                count++;
                n = n / 10;
            }
            n = temp;
            while (n > 0) {
                rem = n % 10;
                sum = sum + (int) (Math.pow(rem, count));
                n = n / 10;
            }
            if (temp == sum) {
                System.out.println(temp);
            }
        }

    }
}
